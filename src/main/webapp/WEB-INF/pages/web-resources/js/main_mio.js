var trimBeforeValidation = function (element) {
    var $element = $(element);
    $element.val($.trim($element.val()));
    return true;
};