package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllClass () {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest () {
        testCounter++;
        System.out.println("Prepare to execute test # " + testCounter);
    }
    @Test
    public void testAddPost() {
        ForumUser forumUser = new ForumUser("smith", "Jane Smith");
        forumUser.addPost("smith", "Hi. This is my first contribution");
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testAddComment () {
        ForumUser forumUser = new ForumUser("smith", "Jane Smith");
        ForumPost thePost = new ForumPost("Hi. This is my first contribution", "smith");
        forumUser.addComment (thePost, "smith", "hi there");
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    public void testGetPost() {
        ForumUser forumUser = new ForumUser("smith", "Jane Smith");
        ForumPost thePost = new ForumPost("Hi. This is my first contribution", "smith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        ForumPost retrievedPost = forumUser.getPost(0);
        Assert.assertEquals(thePost, retrievedPost);
    }
    @Test
    public void testGetComment () {
        ForumUser forumUser = new ForumUser ("smith", "Jane Smith");
        ForumPost thePost = new ForumPost ("Hi. This is my first contribution", "smith");
        ForumComment theComment = new ForumComment (thePost, "hi there", "smith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        ForumComment retrievedComment = forumUser.getComment(0);
        Assert.assertEquals(theComment, retrievedComment);
    }
    @Test
    public void testRemovePostNotExisting() {
        ForumUser forumUser = new ForumUser("smith", "Jane Smith");
        ForumPost thePost = new ForumPost ("Hi. This is my first contribution", "smith");
        boolean result = forumUser.removePost(thePost);
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveCommentNotExisting () {
        ForumUser forumUser = new ForumUser ("smith", "Jane Smith");
        ForumPost thePost = new ForumPost ("Hi. This is my first contribution", "smith");
        ForumComment theComment = new ForumComment (thePost, "hi there", "smith");
        boolean result = forumUser.removeComment(theComment);
        Assert.assertFalse(result);
    }
    @Test
    public void testRemovePost() {
        ForumUser forumUser = new ForumUser ("smith", "Jane Smith");
        ForumPost thePost = new ForumPost ("Hi. This is my first contribution", "smith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        boolean result = forumUser.removePost(thePost);
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveComment () {
        ForumUser forumUser = new ForumUser ("smith", "Jane Smith");
        ForumPost thePost = new ForumPost ("Hi. This is my first contribution", "smith");
        ForumComment theComment = new ForumComment (thePost, "hi there", "smith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        boolean result = forumUser.removeComment(theComment);
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
