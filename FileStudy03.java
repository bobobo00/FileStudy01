package cn.io.study01;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author dell
 *
 */

public class FileStudy03 {
	public static void main(String[] args) throws IOException {
		File src=new File("E:\\workspace-java\\IO������\\����.PNG");
		//������Ϣ
		System.out.println("����:"+src.getName());
		System.out.println("·��:"+src.getPath());
		System.out.println("��·��:"+src.getParent());
		System.out.println("������:"+src.getParentFile().getName());
		System.out.println("����·��:"+src.getAbsolutePath());
		
		System.out.println("####################################");
		//�ļ�״̬
		System.out.println("�Ƿ����:"+src.exists());
		System.out.println("�Ƿ����ļ�:"+src.isFile());
		System.out.println("�Ƿ����ļ���:"+src.isDirectory());
		
		src=new File("xxx");
		if(!src.exists()) {
			System.out.println("�ļ�������");
		}else if(src.isFile()) {
			System.out.println("�ļ�����");
		}else {
			System.out.println("�ļ��в���");
		}
		
		//������Ϣ
		System.out.println("�ļ����ȣ�"+src.length());//�ļ��ֽ���
		boolean flag=src.createNewFile();//�����ڲŴ��������ڴ����ɹ���ֻ�ܴ����ļ���
		System.out.println(flag);
		boolean f=src.delete();//ɾ���Ѿ����ڵ��ļ�
		System.out.println(f);
	}

}
