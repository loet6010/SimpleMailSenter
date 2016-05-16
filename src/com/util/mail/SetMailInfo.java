package com.util.mail;

public class SetMailInfo {

	public MailSenderInfo getMailInfo(String subject, String content) {
		// 设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		// 服务器地址
		mailInfo.setMailServerHost("smtp.ym.163.com");
		// 端口号
		mailInfo.setMailServerPort("25");
		// 是否需要身份验证
		mailInfo.setValidate(true);
		// 发件人邮箱
		mailInfo.setUserName("liur@mchz.com.cn");
		// 邮箱密码
		mailInfo.setPassword("HZmc6010");
		// 发件人地址
		mailInfo.setFromAddress("liurh@mchz.com.cn");
		// 收件人邮箱
		mailInfo.setToAddress("361198241@qq.com");
		// 邮箱标题
		mailInfo.setSubject(subject);
		// 邮箱内容
		mailInfo.setContent(content);
		
		return mailInfo;
	}

}
