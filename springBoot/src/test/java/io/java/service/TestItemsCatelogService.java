package io.java.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import io.java.dto.ItemsCatelogDTO;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration
@SpringBootConfiguration
@SpringBootTest
public class TestItemsCatelogService {
	@Mock
	MockService testMockService;
	@InjectMocks
	ItemsCatelogService itemsCatelogService;
	//@Autowired
	//ItemsCatelogDTO dtoObj;
	
	/*@Test
    public void testGetItem() {
		dtoObj.setItemId(2);
		dtoObj.setItemBrandName("Iphone");
		dtoObj.setItemCategory("Mobiles");
        when(testMockService.getItem()).thenReturn(
        		dtoObj	
        		);
        assertEquals(dtoObj, itemsCatelogService.getItem(2));
    }
*/
	@Test
    public void test() {
		
        when(testMockService.testDeleteItem(1)).thenReturn(
        		2
        		);
        
        assertEquals(2, itemsCatelogService.deleteItem(2));
    }
}
