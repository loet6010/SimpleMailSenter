package com.util.test;

import com.util.mail.MailSenderInfo;
import com.util.mail.SetMailInfo;
import com.util.mail.SimpleMailSender;

public class SentMailTest {

	public static void main(String[] args) {
		// 设置邮箱标题
		String subject = "测试邮件";
		// 设置邮箱内容
		String content = "测试内容";

		// 获取邮件信息
		MailSenderInfo mailInfo = new SetMailInfo().getMailInfo(subject, content);

		// 发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		if (sms.sendTextMail(mailInfo)) {
			System.out.println("邮件发送成功");
		} else {
			System.out.println("邮件发送失败");
		}
	}

}
