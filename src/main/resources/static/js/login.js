/**
 * Created by lingxingu on 2017/3/2.
 */

var app = new Vue({
    el: '#app',
    data: {
        message: 'Hello Vue.js!'
    }
})

Vue.http.options.emulateJSON = true;
new Vue({
    el: '#app-table',
    data:{
        name: "user",
        password: 123456,
        message: "waiting login"
    },
    methods: {
        login: function() {
            // alert(this.name + this.password)
            this.$http.post('/loginGrocery', {name: this.name, password: this.password}).then(response => {
                this.message="OK";
                window.location.href = '/home';
            }, response => {
                this.message="Fail"
            });
        }
    }
})