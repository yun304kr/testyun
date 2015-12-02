package egovframework.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.activation.DataSource;
import javax.annotation.Resource;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:egovframework/spring/com/**/context-*.xml" })
public class BasicDataAccessTest {
	
	@Resource(name = "dataSource")
	BasicDataSource dataSource;
	
	@Resource(name = "bookDAO")
	BookDAO bookDAO;
	
	
	public BookVO makeVO() {
		BookVO vo = new BookVO();
		
		vo.setName("kim");
		return vo;
	}
	
	@Test
	public void test() {
		
		ArrayList<BookVO> selectBookList;
		BookVO abookVO = makeVO();
		//bookDAO.insertBook(bookVO);
		selectBookList = (ArrayList<BookVO>)bookDAO.selectBook(abookVO);
		
		for (BookVO bookVO : selectBookList) {
			System.out.println(bookVO.getName());
		}
		
		
	
		
	} 

}
