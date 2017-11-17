/**
 * Created by lu on 2017/7/14.
 */

function openWindow(url, name, iWidth, iHeight) {
    // url 转向网页的地址
    // name 网页名称，可为空
    // iWidth 弹出窗口的宽度
    // iHeight 弹出窗口的高度
    //window.screen.height获得屏幕的高，window.screen.width获得屏幕的宽

    var iTop = (window.screen.height - 30 - iHeight) / 2; //获得窗口的垂直位置;
    var iLeft = (window.screen.width - 10 - iWidth) / 2; //获得窗口的水平位置;
    window.open(url, name,
            'height=' + iHeight + ',,innerHeight=' + iHeight + ',width='
            + iWidth
            + ',innerWidth=' + iWidth + ',top=' + iTop + ',left=' + iLeft
            + ',toolbar=no,menubar=no,scrollbars=auto,resizeable=no,location=no,status=no');

}