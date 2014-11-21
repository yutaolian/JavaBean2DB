package test.bena2db.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
/**
 * 
 * @author lyt
 *
 */

public class Test {
	
	public static void main(String[] args) {

		createDB();
	}
	
	public static void createDB(){
		
		//装载配置文件 
		/**
		 * 使用注解是这个会报错（ An AnnotationConfiguration instance is required to use）
		 * hibernate3 应当使用    AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		 * 此版本为hibernate4.2.16
		 */
		
		Configuration cfg = new Configuration().configure();
		
        SchemaExport export = new SchemaExport(cfg); 
        
        export.create(true, true);  
	}
}
