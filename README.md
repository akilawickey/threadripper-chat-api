# THREADRIPPER CHAT API:
## WEBSOCKET API:

### `ENDPOINT /ws`

### `SEND /queue/sendMessage`
**request:**
```json
{
    "token": "CHAT eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiI3NzlkZjNkOC03NGQwLTQ4M2YtODlmNy05ZmY4ZTE5NTQwN2QiLCJzdWIiOiJhIiwiaWF0IjoxNTM5NDQ3NDM5LCJleHAiOjE1NDAwNTIyMzl9.RoxXnb38achZ6EjRwYKiYIcd35pac96w3NvFwQfZkhbqYh6C1z-9iqcuqLl_nDmF_I54soNPXSGZ16MMOHhsmA",
    "type": "JOIN"
}
```
```json
{  
    "content": "test",
    "conversationId": "1",
    "type": "TEXT",
    "token": "CHAT eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiI3NzlkZjNkOC03NGQwLTQ4M2YtODlmNy05ZmY4ZTE5NTQwN2QiLCJzdWIiOiJhIiwiaWF0IjoxNTM5NDQ3NDM5LCJleHAiOjE1NDAwNTIyMzl9.RoxXnb38achZ6EjRwYKiYIcd35pac96w3NvFwQfZkhbqYh6C1z-9iqcuqLl_nDmF_I54soNPXSGZ16MMOHhsmA"
}
```

### `SUBCRIBE /topic/{username}`
**response: token attribute is not used**
```json
{
    "messageId":null,
    "type":"JOIN",
    "content":null,
    "datetime":null,
    "conversationId":null,
    "username":"a",
    "token":""}
```
```json
{
    "messageId":null,
    "type":"LEAVE",
    "content":null,
    "datetime":null,
    "conversationId":null,
    "username":"b",
    "token":null
}
```
```json
{  
    "messageId":"23",
    "type":"TEXT",
    "content":"fsd",
    "datetime":"2018-10-22 03:10:34",
    "conversationId":"1",
    "username":"b",
    "token":""
}
```
## REST API:

### `POST /api/login?username=&password=`
    
```json
->  token in header
    Authorization: CHAT eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiI3NzlkZjNkOC03NGQwLTQ4M2YtODlmNy05ZmY4ZTE5NTQwN2QiLCJzdWIiOiJhIiwiaWF0IjoxNTM5NDQ3NDM5LCJleHAiOjE1NDAwNTIyMzl9.RoxXnb38achZ6EjRwYKiYIcd35pac96w3NvFwQfZkhbqYh6C1z-9iqcuqLl_nDmF_I54soNPXSGZ16MMOHhsmA

    {
        "active": true, 
        "user": 
            {
            "displayName": "userA",
            "avatarUrl": "http://localhost:8083/api/avatar/default.jpg",
            "username": "a",
            "email": "a@gmail.com"
            }
    }
    
```

### `POST /api/signup?username=&password=&displayName=&email=`
```json
->  {"success": "true"}

->  {
        "timestamp": 1539447546025,
        "status": 409,
        "error": "Conflict",
        "message": "Username has been used",
        "path": "/api/signup"
    }

->  {
        "timestamp": 1539447546025,
        "status": 520,
        "error": "Unknown Error",
        "message": "Some error has occurred",
        "path": "/api/signup"
    }
```

### `POST /api/signup2?username=&password=&displayName=&email=&avatarUrl=`
```json
->  {"success": "true"}

->  {
        "timestamp": 1539447546025,
        "status": 409,
        "error": "Conflict",
        "message": "Username has been used",
        "path": "/api/signup"
    }

->  {
        "timestamp": 1539447546025,
        "status": 520,
        "error": "Unknown Error",
        "message": "Some error has occurred",
        "path": "/api/signup"
    }
```

### `GET /api/verify/{username}/{hash}`
**Email will be sent automatically if user is not active**
### `GET /api/verify/resend/{username}`
### `GET /api/forgot/{username}`

### `PUT /api/password?oldPassword=&newPassword=`
```
input:  token in Authorization header
```
```json
->  {
        "timestamp": 1539520526152,
        "status": 400,
        "error": "Bad Request",
        "message": "Incorrect password",
        "path": "/api/changePassword"
    }

->  {"result":"success"}
```

### `GET /api/user` 
**For test only**

```json
->  [
        {
            "username": "a",
            "password": "$2a$10$gj4OtbyETCraxaVKBg5CXuyIxjOy93vo83nJCgnytwkv5BUHpjmi.",
            "displayName": "displayD",
            "email": "1611985@hcmut.edu.vn"
        }
    ]
```


### `GET /api/user?search=`
```
input:  token in Authorization header
```
```json
->  [
        {
            "username": "huynhha12798",
            "displayName": "Huynh Ha",
            "email": "huynhha12798@gmail.com",
            "avatarUrl": "http://localhost:8083/api/avatar/default.jpg",
            "online": false
        }
    ]
```
### `GET /api/user?search=&offset=&limit=`
### `GET /api/user/{username}
```
input:  token in Authorization header
```
```json
->  {
        "username": "a",
        "displayName": "userA",
        "email": "1611985@hcmut.edu.vn",
        "avatarUrl": "vre.hcmut.edu.vn/threadripper/api/avatar/default.jpg",
        "online": false
    }
    
->  {
        "timestamp": 1540779604010,
        "status": 404,
        "error": "Not Found",
        "message": "User doesn't exist",
        "path": "/api/user/e"
    }
```

### `PUT /api/displayName?newDisplayName=`
```json
    "success": true
```

### `POST /api/conversation`
```json
input:  token in Authorization header
{
    "listUsername": [
        "username1",
        "username2",
        "username2"
    ]
}
```          
```json
->  {
        "conversationId": "12345"
    }
```


### `GET /api/conversation`

```json
input: token in Authorization header
```

```json
[
    {
        "conversationId": "3",
        "conversationName": "NameOfABC",
        "lastMessage": null,
        "listUser": [
            {
                "displayName": "userA",
                "username": "a",
                "nickname": null,
                "avatarUrl": "vre.hcmut.edu.vn/threadripper/api/avatar/default.jpg",
                "online": false
            },
            {
                "displayName": "userB",
                "username": "b",
                "nickname": null,
                "avatarUrl": "vre.hcmut.edu.vn/threadripper/api/avatar/default.jpg",
                "online": false
            },
            {
                "displayName": "userC",
                "username": "c",
                "nickname": null,
                "avatarUrl": "vre.hcmut.edu.vn/threadripper/api/avatar/default.jpg",
                "online": false
            }
        ],
        "notiCount": 0
    }
]
```

### `GET /api/friend`
```json
input: token in Authorization header
```
```json
[
    {
        "conversationId": "1",
        "conversationName": "NameOfAB",
        "lastMessage": null,
        "listUser": [
            {
                "displayName": "userA",
                "username": "a",
                "nickname": null,
                "avatarUrl": "vre.hcmut.edu.vn/threadripper/api/avatar/default.jpg",
                "online": false
            },
            {
                "displayName": "userB",
                "username": "b",
                "nickname": null,
                "avatarUrl": "vre.hcmut.edu.vn/threadripper/api/avatar/default.jpg",
                "online": false
            }
        ],
        "notiCount": 0
    },
    {
        "conversationId": "2",
        "conversationName": "NameOfBC",
        "lastMessage": null,
        "listUser": [
            {
                "displayName": "userB",
                "username": "b",
                "nickname": null,
                "avatarUrl": "vre.hcmut.edu.vn/threadripper/api/avatar/default.jpg",
                "online": false
            },
            {
                "displayName": "userC",
                "username": "c",
                "nickname": null,
                "avatarUrl": "vre.hcmut.edu.vn/threadripper/api/avatar/default.jpg",
                "online": false
            }
        ],
        "notiCount": 0
    }
]
```

### `GET /api/conversation/{conversationId}`
```json
input: token in Authorization header
```
```json
{
    "conversationId": "2",
    "conversationName": null,
    "lastMessage": {
        "messageId": "2",
        "type": "TEXT",
        "content": "2",
        "datetime": "2018-10-19 14:22:18",
        "conversationId": "2",
        "username": "b",
    },
    "listUser": [
        {
            "displayName": "displayD",
            "username": "a",
            "nickname": null,
            "avatarUrl": "http://localhost:8083/api/avatar/10.bmp",
            "online": false
        },
        {
            "displayName": "b",
            "username": "c",
            "nickname": null,
            "avatarUrl": "http://localhost:8083/api/avatar/default.jpg",
            "online": false
        }
    ],
    "notiCount": 1
}
```

### `DELETE /api/conversation/{conversationId}`
```json
input: token in Authorization header
```
```json
->  {
        "result": "success"
    }
```

### `GET /api/message/{conversationId}`

```json
input: token in Authorization header
```

```json
->  {
        "timestamp": 1539943510009,
        "status": 520,
        "error": "Http Status 520",
        "message": "User does not have access privileges",
        "path": "/api/message"
    }

->  [
        {
            "messageId": "2",
            "type": "TEXT",
            "content": "2",
            "datetime": "2018-10-19",
            "conversationId": "2",
            "username": "b"
        },
        {
            "messageId": "1",
            "type": "TEXT",
            "content": "1",
            "datetime": "2018-10-19",
            "conversationId": "2",
            "username": "a"
        }
    ]
```
### `GET /api/message/{conversationId}?offset=?&limit=?`

### `GET /api/avatar/{filename}.{ext}`
**Support all format** 

```json
->  Header:
    Content-Type: image/png (image/jpeg OR image/gif OR image/bmp ...)
    Content-Disposition: attachment; filename="{filename}.{ext}"
```

### `GET /api/image/{filename}.{ext}`
**Support all format** 

```json
->  Header:
    Content-Type: image/png (image/jpeg OR image/gif OR image/bmp ...)
    Content-Disposition: attachment; filename="{filename}.{ext}"
```

### `GET /api/file/**`
**Support all format** 

```json
->  Header:
    Content-Disposition: attachment; filename="{filename.ext}"
```

### `POST /api/avatar`
**Support all format** 

```json
input: token in Authorization header
param:
    file: File type Object,
    ext: file extension ("jpg"/"png"/"gif"/"bmp"/...)
```
```json
{
    "avatarUrl": "http://localhost:8083/api/avatar/10.bmp"
}
```

### `POST /api/image`
**Support all format** 

```json
input: token in Authorization header
param:
    file: File type Object,
    ext: file extension ("jpg"/"png"/"gif"/"bmp"/...)
```
```json
{
    "imageUrl": "http://localhost:8083/api/image/10.jpg"
}
```

### `POST /api/file`
**Support all format** 

```json
input: token in Authorization header
param:
    file: File type Object,
    ext: file extension ("cpp"/"png"/"py"/"exe"/...)
```
```json
{
    "fileUrl": "http://localhost:8083/api/file/10.exe"
}
```
