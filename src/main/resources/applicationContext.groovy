beans {
    singletonBean(MyBean) { bean ->
        bean.scope = 'singleton'
    }

    prototypeBean(MyBean) { bean ->
        bean.scope = 'prototype'
    }
}