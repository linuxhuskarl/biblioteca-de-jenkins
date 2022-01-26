package com.example.secret

/** Class Secret
* Beware, it contains secrets!
*/
class Secret {
    
    String password
    String hostname
    String username

    String sshCommand() {
        String ret = "ssh ${username}@${hostname}"
        if(password != "") {
            ret = "sshpass -p ${password} " + ret
        }
        return ret
    }
}
