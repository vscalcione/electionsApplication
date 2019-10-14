$.fn.validations['loginAutorizedForm'] = {
    lang: 'it',
    rules:{
        password:{
            required: true,
            minlenght: 8,
            maxLength: 16,
        },
        email:{
            required: true,
            email: true,
            maxlength: 254,
            nowhitespace: {
                depends: function () {
                    trimBeforeValidation($(this));
                }
            },
        }
    }
}

$.validator.addMethod("checkCodLogin", function() {
    var codLogin = $('#codLogin').val();
    var lengthCodLogin = codLogin.length();
    var result = true;
    if(!(lengthCodLogin >= 8 && lengthCodLogin <= 16)){
        return false;
    }
    return result;
},"Codice inserito non corretto oppure non valido");