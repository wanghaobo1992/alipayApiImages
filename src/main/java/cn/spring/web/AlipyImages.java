package cn.spring.web;

import org.springframework.core.io.Resource;

public class AlipyImages {

	private Resource imgs;

	public Resource getImgs() {
		return imgs;
	}

	public void setImgs(Resource imgs) {
		this.imgs = imgs;
	}

	@Override
	public String toString() {
		return "AAAA [imgs=" + imgs + "]";
	}

//	public static void main(String[] args) throws IOException {
//
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AAAA aaaa = (AAAA) ctx.getBean("aaaa");
//		
//		aaaa.getImgs().getFile();
//		
//		InputStream in = ServletContext.class.getResourceAsStream("");
//		  
//		 IOUtils.toByteArray(in);
//		 
//		 byte[] encodeBase64 = Base64.encodeBase64(IOUtils.toByteArray(in));
//		 String base64Encoded = new String(encodeBase64, "UTF-8");
//		 
//		
//		System.out.println(aaaa.getImgs().getFile());
//
//	}
}
