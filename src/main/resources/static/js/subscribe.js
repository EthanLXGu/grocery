/**
 * Created by lingxingu on 2017/3/5.
 */
var subscribe_app = new Vue({
    el: "#subscribe-form",
    data: {

    },
    methods: {
        subscribe: function () {
            if (this.email==null) {
                alert("Plz input email address");
            } else {
                alert(this.email + " successfully subscribe!");
            }
        }
    }
})
