fun foo() {
    return @ 1
    return (@ 2)

    @ foo("")

    @ 3 + @  4 * @ 5 infix @ 6

    foo.bar(@ fun(x: Int) {

    })

    if (@ true || true) {

    }
    else {}

    label@ @ while (true) {
        @ break@label
    }

  