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
		File src=new File("E:\\workspace-java\\IO流技术\\捕获.PNG");
		//基本信息
		System.out.println("名称:"+src.getName());
		System.out.println("路径:"+src.getPath());
		System.out.println("父路径:"+src.getParent());
		System.out.println("父对象:"+src.getParentFile().getName());
		System.out.println("绝对路径:"+src.getAbsolutePath());
		
		System.out.println("####################################");
		//文件状态
		System.out.println("是否存在:"+src.exists());
		System.out.println("是否是文件:"+src.isFile());
		System.out.println("是否是文件夹:"+src.isDirectory());
		
		src=new File("xxx");
		if(!src.exists()) {
			System.out.println("文件不存在");
		}else if(src.isFile()) {
			System.out.println("文件操作");
		}else {
			System.out.println("文件夹操作");
		}
		
		//其他信息
		System.out.println("文件长度："+src.length());//文件字节数
		boolean flag=src.createNewFile();//不存在才创建，存在创建成功，只能创建文件。
		System.out.println(flag);
		boolean f=src.delete();//删除已经存在的文件
		System.out.println(f);
	}

}
