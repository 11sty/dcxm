package com.dc.web.listener;

import com.dc.utils.MakeOrderNumUtil;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class RECV_UBANKNO {
    public String go(String xmlInfo) throws UnknownHostException, IOException {

        // 向服务器端发送请求，服务器IP地址和服务器监听的端口号
        Socket client = new Socket("192.168.1.125", 12345);

        // 通过printWriter 来向服务器发送消息
        PrintWriter printWriter = new PrintWriter(client.getOutputStream());
        System.out.println("连接已建立...");

        // 发送消息
        printWriter.println(xmlInfo);

        printWriter.flush();

        // InputStreamReader是低层和高层串流之间的桥梁
        // client.getInputStream()从Socket取得输入串流
        InputStreamReader streamReader = new InputStreamReader(
                client.getInputStream());

        // 链接数据串流，建立BufferedReader来读取，将BufferReader链接到InputStreamReder
        BufferedReader reader = new BufferedReader(streamReader);
        String advice = reader.readLine();

        reader.close();
        return advice;
    }

    public static void main(String[] args) throws UnknownHostException,
            IOException {
        // 拼接xml报文
        /*
         * <?xml version="1.0" encoding="GB2312" standalone="yes" ?> <TX>
         * <REQUEST_SN>请求序列码</REQUEST_SN> <CUST_ID>客户号</CUST_ID>
         * <USER_ID>操作员号</USER_ID> <PASSWORD>密码</PASSWORD>
         * <TX_CODE>6W0201</TX_CODE> <LANGUAGE>CN</LANGUAGE> <TX_INFO>
         * </TX_INFO> </TX>
         */
        StringBuilder sb = new StringBuilder();
        MakeOrderNumUtil makeOrderNumUtil = new MakeOrderNumUtil();
        makeOrderNumUtil.makeOrderNum();
        String num = makeOrderNumUtil.makeOrderNum();
        sb.append("<?xml version='1.0' encoding='GB2312' standalone='yes' ?>  ");
        sb.append("<TX>");
        sb.append("<REQUEST_SN>" + num + "</REQUEST_SN>");// 请求序列码
        sb.append("<CUST_ID>ZJ33000009175763101</CUST_ID>");// 客户号
        sb.append("<USER_ID>WLPT01</USER_ID>");// 操作员号
        sb.append("<PASSWORD>123456</PASSWORD>");// 密码
        sb.append("<TX_CODE>6W0201</TX_CODE>");// 交易请求码
        sb.append("<LANGUAGE>CN</LANGUAGE> ");// 语言
        sb.append("<TX_INFO>");
        sb.append("</TX_INFO>");
        sb.append("</TX>");
        // 提交请求
        /*
         * 4、发送报文兼容GB2312和GB18030编码格式，返回报文为GB18030编码格式，
         * 另需要测试一下发送报文编码格式为GB18030的情况下交易是否OK。
         */
        String utf8 = null;
        try {
            utf8 = new String(sb.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String unicode = null;
        try {
            unicode = new String(utf8.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String gbk = null;
        try {
            gbk = new String(unicode.getBytes("GB2312"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // String xml = new String();//GB18030
        RECV_UBANKNO c = new RECV_UBANKNO();
        String advice = c.go(gbk);
        System.out.println("接收到服务器的消息 ：" + advice);
    }
}
