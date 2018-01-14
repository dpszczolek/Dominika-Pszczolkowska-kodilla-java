package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }
    @After
    public void after() {
        System.out.println("Test case: after");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jane Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing: " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealName() {
        SimpleUser simpleUser = new SimpleUser("TheForumUser", "Jane Smith");

        String result = simpleUser.getRealName();
        System.out.println("Testing: " + result);

        Assert.assertEquals("Jane Smith", result);
    }
}
