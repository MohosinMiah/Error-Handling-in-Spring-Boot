🎦StudentCRUD-Using-Spring-Boot -Using-Spring-Boot 3
</br>
❓ What we will understand from this project ?
This project mainly purpose is to handle error for entity class.
For example, If a blog post has three field like Title, Content, Body. We define Title should be unique.If not display the error message. If at a time title and content is empty then display error message in a list of error in between error object.
##Sample Error:
<code>
{
    "errors": {
        "description": "Post description should have at least 10 characters",
        "title": "Post title should have at least 2 characters"
    },
    "status": "BAD_REQUEST",
    "timestamp": "2023-05-15T06:17:23.4231378"
}
<code>

1) Project structure for Spring Boot project
2) Core concept of Spring Boot project
3) CURD implementation
4) Controller Layer
5) Service Layer
6) Repository Layer
7) Entity Layer
8) Frequently use Annotation like @RestController, @Service, @Repository, @SpringBootApplication, @StringBootTest
Testing based on controller layer, service layer and repository layer

