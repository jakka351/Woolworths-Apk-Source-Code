package com.behaviosec.rl;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.behaviosec.rl.android.EditTextHandler;
import com.behaviosec.rl.android.LogBridge;

/* loaded from: classes4.dex */
public class yllllyl implements Window.Callback {
    public static int c0063006300630063cc0063 = 0;
    public static int c0063c00630063cc0063 = 2;
    public static int cc0063c0063cc0063 = 76;
    public static int ccc00630063cc0063 = 1;
    private static final String q007100710071qqq;
    private static final String qq00710071qqq = uuxuuuu.pppp0070ppp("\u001f28/;D\u00160.%.(6", (char) (yylylll.r0072r0072r00720072() ^ (-1349847227)), (char) (yllylll.r007200720072r00720072() ^ (-1146716800)));
    private ViewGroup q00710071q0071qq;
    public boolean q0071q00710071qq = true;
    private EditTextHandler q0071qq0071qq;
    private ylyylyl qq0071q0071qq;
    private String qqq00710071qq;
    private Window.Callback qqqq0071qq;

    static {
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383822015);
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741352));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c00630063c0063cc0063()) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        q007100710071qqq = uuxuuuu.pp0070p0070ppp("CBs0\u000fyw}\n\u0005qwQ#V,f\u0016\u0012=r`\u0019", cRrrr007200720072, cR0072rrr00720072, (char) (iRrrr007200720072 ^ 383821871));
    }

    public yllllyl(@NonNull Window.Callback callback, @Nullable EditTextHandler editTextHandler, @Nullable ylyylyl ylyylylVar, @NonNull ViewGroup viewGroup, @NonNull String str) {
        this.qqqq0071qq = callback;
        this.q0071qq0071qq = editTextHandler;
        this.qq0071q0071qq = ylyylylVar;
        this.q00710071q0071qq = viewGroup;
        if (ylyylylVar != null) {
            ylyylylVar.r00720072rr0072r(viewGroup);
        }
        this.qqq00710071qq = str;
    }

    public static int c00630063c0063cc0063() {
        return 0;
    }

    public static int c0063ccc0063c0063() {
        return 2;
    }

    public static int cc006300630063cc0063() {
        return 9;
    }

    public static int ccccc0063c0063() {
        return 1;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback == null) {
            LogBridge.w(uuxuuuu.pp0070p0070ppp("6GK@JQ!9E:A9E", (char) (ylyylll.r0072rrr00720072() ^ (-1691741388)), (char) (yllylll.r007200720072r00720072() ^ (-1146716726)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), uuxuuuu.pppp0070ppp("nWhlakr=ZdcXVW^\u0012.-\u000f\\bXW", (char) (yllylll.r007200720072r00720072() ^ (-1146716765)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
            return true;
        }
        boolean zDispatchGenericMotionEvent = callback.dispatchGenericMotionEvent(motionEvent);
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = 1;
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        return zDispatchGenericMotionEvent;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp(",Y\r[)iH\u001ai8n\u0003P", (char) (ylyylll.r0072rrr00720072() ^ (-1691741245)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847224)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)));
        int iR007200720072r00720072 = yllylll.r007200720072r00720072();
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c00630063c0063cc0063()) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            ccc00630063cc0063 = cc006300630063cc0063();
        }
        LogBridge.w(strPp0070p0070ppp, uuxuuuu.pppp0070ppp("~\u0016X\u0004\u001c[=\u0004H\u0016\u001a(Q[uF 4A&E\u0014e", (char) (iR007200720072r00720072 ^ (-1146716865)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))));
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.dispatchKeyShortcutEvent(keyEvent);
        }
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("\u0017(,!+2\u0002\u001a&\u001b\"\u001a&", (char) (ylyylll.r0072rrr00720072() ^ (-1691741399)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344)));
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716673));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            c0063006300630063cc0063 = 20;
        }
        LogBridge.w(strPppp0070ppp, uuxuuuu.pppp0070ppp("dO^dWch5`li`\\_d\u001a$%\u0005TXPM", cR007200720072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847049))));
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847202));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            c0063006300630063cc0063 = 49;
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("\u0005W\u001bQ\u001fgvP V\u001dV&", cR0072r0072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847118)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), uuxuuuu.pppp0070ppp("+\u0016)/&2;\b'34++.7l\u000b\fo?G?@", (char) (yylylll.r0072r0072r00720072() ^ (-1349847141)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))));
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ylyylyl ylyylylVar = this.qq0071q0071qq;
        if (ylyylylVar != null) {
            try {
                ylyylylVar.r00720072rrrr(motionEvent);
            } catch (Throwable th) {
                LogBridge.e(uuxuuuu.pp0070p0070ppp("Viofr{Mguluo}", (char) (yyyllll.rrrr007200720072() ^ 383822077), (char) (ylyylll.r0072rrr00720072() ^ (-1691741250)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), uuxuuuu.pp0070p0070ppp("^", (char) (yllylll.r007200720072r00720072() ^ (-1146716683)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741405)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))) + this.qqq00710071qq + uuxuuuu.pp0070p0070ppp("a%jp{yk\u007foub~\u0006tzX\u000bz\u0005\f@B", (char) (yllylll.r007200720072r00720072() ^ (-1146716859)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741279)), (char) (yyyllll.rrrr007200720072() ^ 383821866)), th);
            }
        }
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.dispatchTouchEvent(motionEvent);
        }
        LogBridge.w(uuxuuuu.pppp0070ppp("}\u000f\u0013\b\u0012\u0019h\u0001\r\u0002\t\u0001\r", (char) (yylylll.r0072r0072r00720072() ^ (-1349847125)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), uuxuuuu.pppp0070ppp("?(9=2<C\u000e+54)'(/b~}_-3)(", (char) (yllylll.r007200720072r00720072() ^ (-1146716761)), (char) ((-1691741330) ^ ylyylll.r0072rrr00720072())));
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.dispatchTrackballEvent(motionEvent);
        }
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("n\u007f\u0004x\u0003\nYq}ryq}", (char) (yllylll.r007200720072r00720072() ^ (-1146716739)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054)));
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716779));
        char cR0072rrr00720072 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741332));
        int i = cc0063c0063cc0063;
        if (((ccccc0063c0063() + i) * i) % c0063c00630063cc0063 != 0) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            c0063006300630063cc0063 = 33;
        }
        LogBridge.w(strPppp0070ppp, uuxuuuu.pppp0070ppp("\nt\b\u000e|\t\u0012^u\u0002\u0003yqt}3IJ.}}uv", cR007200720072r00720072, cR0072rrr00720072));
        return true;
    }

    public Window.Callback getWindowCallback() {
        int iCc006300630063cc0063 = cc006300630063cc0063();
        if (((ccc00630063cc0063 + iCc006300630063cc0063) * iCc006300630063cc0063) % c0063c00630063cc0063 != 0) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            c0063006300630063cc0063 = 84;
        }
        return this.qqqq0071qq;
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback == null) {
            LogBridge.w(uuxuuuu.pppp0070ppp("^oshryIambiam", (char) (yllylll.r007200720072r00720072() ^ (-1146716802)), (char) (yllylll.r007200720072r00720072() ^ (-1146716786))), uuxuuuu.pp0070p0070ppp("#\u000e!'\u001e*3\u007f\u001f+,##&/d\u0003\u0004g7?78", (char) (yyyllll.rrrr007200720072() ^ 383821927), (char) (yllylll.r007200720072r00720072() ^ (-1146716703)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))));
            return;
        }
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = 60;
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback == null) {
            LogBridge.w(uuxuuuu.pppp0070ppp("\u0017*0'3<\u000e(6-60>", (char) (ylyylll.r0072rrr00720072() ^ (-1691741354)), (char) (yllylll.r007200720072r00720072() ^ (-1146716787))), uuxuuuu.pppp0070ppp("{duynx\u007fJgqpecdk\u001f;:\u001cioed", (char) (yllylll.r007200720072r00720072() ^ (-1146716858)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))));
            return;
        }
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c00630063c0063cc0063()) {
            cc0063c0063cc0063 = 37;
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            callback.onAttachedToWindow();
            return;
        }
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp(",=A6@G\u0017/;07/;", (char) (yllylll.r007200720072r00720072() ^ (-1146716815)), (char) (yyyllll.rrrr007200720072() ^ 383821979), (char) (yllylll.r007200720072r00720072() ^ (-1146716785)));
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847105));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = 56;
            c0063006300630063cc0063 = 17;
        }
        LogBridge.w(strPp0070p0070ppp, uuxuuuu.pp0070p0070ppp(";T\u0005D\u0006}~g\\:S\u001f&G\u0002?qxL\f\u007f\u0016\u0007", cR0072r0072r00720072, (char) (iRrrr007200720072 ^ 383822079), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))));
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            callback.onContentChanged();
            return;
        }
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("h%?f_j^cE,\u0001\u000e|", (char) (ylyylll.r0072rrr00720072() ^ (-1691741320)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741274)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056)));
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716782));
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063ccc0063c0063() != c0063006300630063cc0063) {
            cc0063c0063cc0063 = 57;
            c0063006300630063cc0063 = 89;
        }
        LogBridge.w(strPp0070p0070ppp, uuxuuuu.pp0070p0070ppp("H1BF;EL\u00174>=2018k\b\u0007h6<21", cR007200720072r00720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716676)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.onCreatePanelMenu(i, menu);
        }
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847076));
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383822040);
        int i2 = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i2) * i2) % c0063c00630063cc0063 != c00630063c0063cc0063()) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("4EI>HO\u001f7C8?7C", cR0072r0072r00720072, cRrrr007200720072, (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pppp0070ppp("N7HLAKR\u001d:DC867>q\u000e\rn<B87", (char) (yllylll.r007200720072r00720072() ^ (-1146716841)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))));
        return true;
    }

    @Override // android.view.Window.Callback
    @Nullable
    public View onCreatePanelView(int i) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback == null) {
            LogBridge.w(uuxuuuu.pppp0070ppp("'8<1;B\u0012*6+2*6", (char) (yyyllll.rrrr007200720072() ^ 383821924), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), uuxuuuu.pp0070p0070ppp("s\u001c\u001e\u001d\u0019\u0006\fE`L0jXLaU\u000e\u007fy\u001eHG\u0012", (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741429)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
            return null;
        }
        int i2 = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i2) * i2) % c0063c00630063cc0063 != 0) {
            cc0063c0063cc0063 = 79;
            c0063006300630063cc0063 = 5;
        }
        return callback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        ylyylyl ylyylylVar;
        if (this.q0071q00710071qq && (ylyylylVar = this.qq0071q0071qq) != null) {
            try {
                ylyylylVar.rrrr0072rr();
            } catch (Throwable th) {
                LogBridge.e(uuxuuuu.pppp0070ppp("\u007f\u0011\u0015\n\u0014\u001bj\u0003\u000f\u0004\u000b\u0003\u000f", (char) (yyyllll.rrrr007200720072() ^ 383821878), (char) (yyyllll.rrrr007200720072() ^ 383821865)), uuxuuuu.pppp0070ppp("M", (char) (yyyllll.rrrr007200720072() ^ 383821868), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))) + this.qqq00710071qq + uuxuuuu.pppp0070ppp("X\u001cllCeucfljjMzxwbu{r~\b9;", (char) (yllylll.r007200720072r00720072() ^ (-1146716837)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), th);
            }
        }
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            callback.onDetachedFromWindow();
            return;
        }
        char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821944);
        char cRrrr0072007200722 = (char) (yyyllll.rrrr007200720072() ^ 383822073);
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072() ^ (-1349847051);
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = 41;
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("+ki\u000e\u0011I\u0011Z?$dM\u0011", cRrrr007200720072, cRrrr0072007200722, (char) iR0072r0072r00720072), uuxuuuu.pppp0070ppp("Q<OULXa.MYZQQT]\u001312\u0016emef", (char) (yyyllll.rrrr007200720072() ^ 383821914), (char) (yyyllll.rrrr007200720072() ^ 383821859)));
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.onMenuItemSelected(i, menuItem);
        }
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("|\u000e\u0012\u0007\u0011\u0018g\u007f\f\u0001\b\u007f\f", (char) (yllylll.r007200720072r00720072() ^ (-1146716764)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054)));
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716877));
        int iRrrr007200720072 = yyyllll.rrrr007200720072();
        int i2 = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i2) * i2) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = 44;
            c0063006300630063cc0063 = 20;
        }
        LogBridge.w(strPppp0070ppp, uuxuuuu.pppp0070ppp(")\u0014#)$05\u0002\u0015!\u001e\u0015\u0019\u001c!VhiI\u0019%\u001d\u001a", cR007200720072r00720072, (char) (iRrrr007200720072 ^ 383821870)));
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, @NonNull Menu menu) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.onMenuOpened(i, menu);
        }
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("n\u007f\u0004x\u0003\nYq\u000e\u0003\n\u0002\u000e", (char) (yyyllll.rrrr007200720072() ^ 383821891), (char) (yyyllll.rrrr007200720072() ^ 383821858));
        char cR0072r0072r00720072 = (char) (yylylll.r0072r0072r00720072() ^ (-1349847190));
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i2 = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i2) * i2) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = 0;
            c0063006300630063cc0063 = 89;
        }
        LogBridge.w(strPppp0070ppp, uuxuuuu.pp0070p0070ppp(";\tM\u0015dxCYF=_\u000f:\u001f\u0007>8f\u0015?\u001fms", cR0072r0072r00720072, (char) (iR0072r0072r00720072 ^ (-1349847152)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741331))));
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            callback.onPanelClosed(i, menu);
        } else {
            LogBridge.w(uuxuuuu.pppp0070ppp("e?Rl d\r'b\t\u000b*a", (char) (yllylll.r007200720072r00720072() ^ (-1146716687)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pppp0070ppp("VATZQ]f3R^_VVYb\u001867\u001bjrjk", (char) (ylyylll.r0072rrr00720072() ^ (-1691741404)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))));
        }
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        int i2 = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i2) * i2) % c0063c00630063cc0063 != c00630063c0063cc0063()) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.onPreparePanel(i, view, menu);
        }
        LogBridge.w(uuxuuuu.pppp0070ppp("\u0010#) ,5\u0007!/&/)7", (char) (yllylll.r007200720072r00720072() ^ (-1146716875)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792))), uuxuuuu.pp0070p0070ppp("\t\n;W\u001d?f\n7Y9FT.U!\u000e%'\rcq\u0011", (char) (yllylll.r007200720072r00720072() ^ (-1146716782)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741245)), (char) (yyyllll.rrrr007200720072() ^ 383821868)));
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != 0) {
            cc0063c0063cc0063 = 9;
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.onSearchRequested();
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("~yu= \u001b\u007fas\u0013\\\u0007\u001d", (char) (ylyylll.r0072rrr00720072() ^ (-1691741233)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847093)), (char) (yyyllll.rrrr007200720072() ^ 383821865)), uuxuuuu.pp0070p0070ppp("\u001e\t\u001c\"\u0019%.z\u001a&'\u001e\u001e!*_}~b2:23", (char) (yllylll.r007200720072r00720072() ^ (-1146716784)), (char) (yyyllll.rrrr007200720072() ^ 383821884), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))));
        return true;
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            callback.onWindowAttributesChanged(layoutParams);
            return;
        }
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072() ^ (-1349847165);
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c0063006300630063cc0063) {
            cc0063c0063cc0063 = cc006300630063cc0063();
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        LogBridge.w(uuxuuuu.pppp0070ppp("evzoy\u0001Phtipht", (char) iR0072r0072r00720072, (char) (yylylll.r0072r0072r00720072() ^ (-1349847051))), uuxuuuu.pp0070p0070ppp("XF\f0\u000b(_\u001a1t=\u0004^$S.e7&1'A1", (char) (yylylll.r0072r0072r00720072() ^ (-1349847269)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741405)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))));
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        String strPppp0070ppp = uuxuuuu.pppp0070ppp("\u007f}evzoy\u0001NvizwFjbnfca", (char) (yyyllll.rrrr007200720072() ^ 383821916), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335)));
        LogBridge.v(uuxuuuu.pp0070p0070ppp("L]aV`g7O[PWO[", (char) (ylyylll.r0072rrr00720072() ^ (-1691741436)), (char) (yllylll.r007200720072r00720072() ^ (-1146716780)), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))), uuxuuuu.pp0070p0070ppp("U", (char) (ylyylll.r0072rrr00720072() ^ (-1691741405)), (char) (yyyllll.rrrr007200720072() ^ 383821935), (char) (yyyllll.rrrr007200720072() ^ 383821870)) + this.qqq00710071qq + uuxuuuu.pp0070p0070ppp("-n", (char) (yyyllll.rrrr007200720072() ^ 383821982), (char) (yllylll.r007200720072r00720072() ^ (-1146716916)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))) + strPppp0070ppp + uuxuuuu.pp0070p0070ppp("\b", (char) (yllylll.r007200720072r00720072() ^ (-1146716901)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847239)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334))) + z + uuxuuuu.pppp0070ppp("M", (char) (yyyllll.rrrr007200720072() ^ 383821839), (char) (yylylll.r0072r0072r00720072() ^ (-1349847049))));
        if (this.q0071q00710071qq && z) {
            try {
                ylyylyl ylyylylVar = this.qq0071q0071qq;
                if (ylyylylVar != null) {
                    ylyylylVar.r00720072rr0072r(this.q00710071q0071qq);
                }
            } catch (Throwable th) {
                LogBridge.e(uuxuuuu.pp0070p0070ppp("a\u001e\b\u0005+\u007f=\u0010\u00044\u0016\u0014\u000e", (char) (yyyllll.rrrr007200720072() ^ 383821905), (char) (yylylll.r0072r0072r00720072() ^ (-1349847088)), (char) (yyyllll.rrrr007200720072() ^ 383821871)), uuxuuuu.pppp0070ppp("\u0006", (char) (yylylll.r0072r0072r00720072() ^ (-1349847129)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847045))) + this.qqq00710071qq + uuxuuuu.pp0070p0070ppp("\rN", (char) (yllylll.r007200720072r00720072() ^ (-1146716798)), (char) (yyyllll.rrrr007200720072() ^ 383821970), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))) + strPppp0070ppp + uuxuuuu.pppp0070ppp("C", (char) (yyyllll.rrrr007200720072() ^ 383821849), (char) (yyyllll.rrrr007200720072() ^ 383821867)) + z + uuxuuuu.pppp0070ppp("c", (char) (yllylll.r007200720072r00720072() ^ (-1146716693)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))), th);
            }
        }
        EditTextHandler editTextHandler = this.q0071qq0071qq;
        if (editTextHandler != null) {
            int i = cc0063c0063cc0063;
            if (((ccc00630063cc0063 + i) * i) % c0063c00630063cc0063 != c0063006300630063cc0063) {
                cc0063c0063cc0063 = 62;
                c0063006300630063cc0063 = 39;
            }
            try {
                editTextHandler.onWindowFocusChanged(z);
            } catch (Throwable th2) {
                LogBridge.e(uuxuuuu.pp0070p0070ppp("\u0012k5oK\u0018-\u000bX\u0013^ y", (char) (yylylll.r0072r0072r00720072() ^ (-1349847242)), (char) (383821970 ^ yyyllll.rrrr007200720072()), (char) ((-1691741335) ^ ylyylll.r0072rrr00720072())), uuxuuuu.pp0070p0070ppp("0", (char) (yyyllll.rrrr007200720072() ^ 383821824), (char) (yylylll.r0072r0072r00720072() ^ (-1349847121)), (char) ((-1349847054) ^ yylylll.r0072r0072r00720072())) + this.qqq00710071qq + uuxuuuu.pppp0070ppp("ZD", (char) (yyyllll.rrrr007200720072() ^ 383822059), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + strPppp0070ppp + uuxuuuu.pp0070p0070ppp("\u000e", (char) (yyyllll.rrrr007200720072() ^ 383822046), (char) (yyyllll.rrrr007200720072() ^ 383821832), (char) (yyyllll.rrrr007200720072() ^ 383821869)) + z + uuxuuuu.pppp0070ppp("4", (char) (ylyylll.r0072rrr00720072() ^ (-1691741342)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847055))), th2);
            }
        }
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            callback.onWindowFocusChanged(z);
        } else {
            LogBridge.w(uuxuuuu.pppp0070ppp("\u0001`5\u0012\u000f;6y=&2\u0003z", (char) (yylylll.r0072r0072r00720072() ^ (-1349847208)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), uuxuuuu.pppp0070ppp("u`syp|\u0006Rq}~uux\u00027UV:\n\u0012\n\u000b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741331)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847046))));
        }
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.qqqq0071qq;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback);
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("HF\u0017X/\u0003?$|>\u0012vO", (char) (ylyylll.r0072rrr00720072() ^ (-1691741338)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847201)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847054))), uuxuuuu.pppp0070ppp("P\u0002eR@x\r0\u001aHFZ)%%vic\u000eT\u0017iw", (char) (yyyllll.rrrr007200720072() ^ 383822054), (char) (yllylll.r007200720072r00720072() ^ (-1146716785))));
        int i = cc0063c0063cc0063;
        if (((ccc00630063cc0063 + i) * i) % c0063ccc0063c0063() == 0) {
            return null;
        }
        cc0063c0063cc0063 = 40;
        c0063006300630063cc0063 = cc006300630063cc0063();
        return null;
    }

    public yllllyl(@NonNull Window.Callback callback, @Nullable EditTextHandler editTextHandler, @Nullable ylyylyl ylyylylVar, @NonNull String str) {
        this.qqqq0071qq = callback;
        this.q0071qq0071qq = editTextHandler;
        this.qq0071q0071qq = ylyylylVar;
        this.qqq00710071qq = str;
    }

    @Override // android.view.Window.Callback
    @RequiresApi
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.qqqq0071qq;
        if (callback != null) {
            return callback.onSearchRequested(searchEvent);
        }
        int iRrrr007200720072 = yyyllll.rrrr007200720072() ^ 383821906;
        int iCc006300630063cc0063 = cc006300630063cc0063();
        if (((ccc00630063cc0063 + iCc006300630063cc0063) * iCc006300630063cc0063) % c0063c00630063cc0063 != 0) {
            cc0063c0063cc0063 = 19;
            c0063006300630063cc0063 = cc006300630063cc0063();
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("c\\#S'Rh6j0\u00012P", (char) iRrrr007200720072, (char) (ylyylll.r0072rrr00720072() ^ (-1691741257)), (char) (yyyllll.rrrr007200720072() ^ 383821871)), uuxuuuu.pp0070p0070ppp("2\u001b,0%/6\u0001\u001e('\u001c\u001a\u001b\"UqpR &\u001c\u001b", (char) (yyyllll.rrrr007200720072() ^ 383821858), (char) (yylylll.r0072r0072r00720072() ^ (-1349847105)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))));
        return true;
    }

    @Override // android.view.Window.Callback
    @Nullable
    @RequiresApi
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Window.Callback callback2 = this.qqqq0071qq;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback, i);
        }
        LogBridge.w(uuxuuuu.pp0070p0070ppp("\u0007+=P\u0002},62[\u001e97", (char) (ylyylll.r0072rrr00720072() ^ (-1691741370)), (char) (yyyllll.rrrr007200720072() ^ 383821931), (char) (yyyllll.rrrr007200720072() ^ 383821865)), uuxuuuu.pppp0070ppp("A,;A<HM\u001a=IF=ADI~\u0001\u0002a1=52", (char) (yllylll.r007200720072r00720072() ^ (-1146716837)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))));
        return null;
    }
}
