package skate.bogota.viewvalueobject

class UserVO {

    var name: String = ""
    var email: String = ""
    var password: String = ""
    var age: String = ""
    var gender: String = ""

    constructor(name: String, email: String, password: String, age: String, gender: String) {
        this.name = name
        this.email = email
        this.password = password
        this.age = age
        this.gender = gender
    }
}