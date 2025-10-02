package com.behaviosec.rl.android;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import java.io.File;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class LogBridge {
    public static int h006800680068hhh0068 = 0;
    public static int h0068h0068hhh0068 = 2;
    public static int hh0068hhhh0068 = 78;
    public static int hhh0068hhh0068 = 1;
    private static boolean x007800780078xx0078 = false;
    private static boolean x00780078xxx0078 = false;
    private static boolean x0078x0078xx0078 = false;
    private static LogBridge x0078xx0078x0078 = null;
    private static boolean xx00780078xx0078 = false;
    private static final boolean xx0078xxx0078 = false;
    private static boolean xxx0078xx0078 = false;
    private static final boolean xxxx0078x0078 = false;
    private Context x00780078x0078x0078;
    private OutputStream xx0078x0078x0078 = null;

    static {
        LogBridge logBridge = new LogBridge(null);
        int i = hh0068hhhh0068;
        if (((hhh0068hhh0068 + i) * i) % hhhh0068hh0068() != h006800680068hhh0068) {
            hh0068hhhh0068 = 54;
            h006800680068hhh0068 = 90;
        }
        x0078xx0078x0078 = logBridge;
    }

    private LogBridge(Context context) {
        this.x00780078x0078x0078 = context;
    }

    public static final void d(String str, String str2) {
        if (xxx0078xx0078) {
            x0078xx0078x0078.ddd00640064d0064(3, str, str2);
        }
    }

    private static final File d00640064d0064d0064(String str, String str2) {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(uuxuuuu.pp0070p0070ppp("z?Pdd::xl.-|?", (char) (ylyylll.r0072rrr00720072() ^ (-1691741360)), (char) (yllylll.r007200720072r00720072() ^ (-1146716692)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847056))));
        sb.append(str);
        sb.append(uuxuuuu.pp0070p0070ppp(":rn\u0003t\u0004", (char) (yllylll.r007200720072r00720072() ^ (-1146716675)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847180)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            int iRrrr007200720072 = yyyllll.rrrr007200720072();
            int i = hh0068hhhh0068;
            if (((hhh0068hhh0068 + i) * i) % h0068h0068hhh0068 != h006800680068hhh0068) {
                hh0068hhhh0068 = 49;
                h006800680068hhh0068 = 16;
            }
            sb2.append(uuxuuuu.pppp0070ppp("\u001b", (char) (iRrrr007200720072 ^ 383821850), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))));
            sb2.append(str2);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        File file = new File(Environment.getExternalStorageDirectory(), sb.toString());
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        Log.w(file.getAbsolutePath(), uuxuuuu.pppp0070ppp("\u0016\u0010\u0017\u0019\u0011\u000fI\u001d\u0017F\t\u0017\t\u0004\u0016\u0006_#'/!\u001e.(*0", (char) (yylylll.r0072r0072r00720072() ^ (-1349847075)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))));
        return null;
    }

    private void d0064d00640064d0064(int i, String str, String str2, Throwable th) {
        dd006400640064d0064(i, str, str2, th, false);
    }

    private void dd006400640064d0064(int i, String str, String str2, Throwable th, boolean z) {
        if (str.length() > 23) {
            int i2 = hh0068hhhh0068;
            if (((hhh0068hhh0068 + i2) * i2) % h0068h0068hhh0068 != h00680068hhhh0068()) {
                hh0068hhhh0068 = 35;
                h006800680068hhh0068 = hh00680068hhh0068();
            }
            str = str.substring(0, 23);
        }
        if (i == 2) {
            if (x0078x0078xx0078) {
                if (th != null) {
                    Log.v(str, str2, th);
                    return;
                } else {
                    Log.v(str, str2);
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            if (xxx0078xx0078) {
                if (th != null) {
                    Log.d(str, str2, th);
                    return;
                } else {
                    Log.d(str, str2);
                    return;
                }
            }
            return;
        }
        if (i == 4) {
            if (x00780078xxx0078) {
                if (th != null) {
                    Log.i(str, str2, th);
                    return;
                } else {
                    Log.i(str, str2);
                    return;
                }
            }
            return;
        }
        if (i == 5) {
            if (x007800780078xx0078) {
                if (th != null) {
                    Log.w(str, str2, th);
                    return;
                } else {
                    Log.w(str, str2);
                    return;
                }
            }
            return;
        }
        if (i == 6 && xx00780078xx0078) {
            if (th != null) {
                Log.e(str, str2, th);
            } else {
                Log.e(str, str2);
            }
        }
    }

    private void ddd00640064d0064(int i, String str, String str2) {
        d0064d00640064d0064(i, str, str2, null);
    }

    public static final void e(String str, String str2) {
        if (xx00780078xx0078) {
            LogBridge logBridge = x0078xx0078x0078;
            if ((hh00680068hhh0068() * (hh00680068hhh0068() + hhh0068hhh0068)) % h0068h0068hhh0068 != h00680068hhhh0068()) {
                hh0068hhhh0068 = 13;
                h006800680068hhh0068 = hh00680068hhh0068();
            }
            logBridge.ddd00640064d0064(6, str, str2);
        }
    }

    public static final boolean getInfoLog() {
        return x00780078xxx0078;
    }

    public static int h00680068hhhh0068() {
        return 0;
    }

    public static int hh00680068hhh0068() {
        return 54;
    }

    public static int hhhh0068hh0068() {
        return 2;
    }

    public static final void i(String str, String str2) {
        if (x00780078xxx0078) {
            LogBridge logBridge = x0078xx0078x0078;
            int i = hh0068hhhh0068;
            if (((hhh0068hhh0068 + i) * i) % h0068h0068hhh0068 != h00680068hhhh0068()) {
                hh0068hhhh0068 = hh00680068hhh0068();
                h006800680068hhh0068 = hh00680068hhh0068();
            }
            logBridge.ddd00640064d0064(4, str, str2);
        }
    }

    public static final void init(Context context) {
        x0078xx0078x0078 = new LogBridge(context);
        int i = hh0068hhhh0068;
        if (((hhh0068hhh0068 + i) * i) % h0068h0068hhh0068 != h00680068hhhh0068()) {
            hh0068hhhh0068 = 90;
            hhh0068hhh0068 = hh00680068hhh0068();
        }
        x007800780078xx0078 = true;
        xx00780078xx0078 = true;
    }

    public static final void v(String str, String str2) {
        boolean z = x0078x0078xx0078;
        int i = hh0068hhhh0068;
        if (((hhh0068hhh0068 + i) * i) % h0068h0068hhh0068 != h006800680068hhh0068) {
            hh0068hhhh0068 = 18;
            h006800680068hhh0068 = 79;
        }
        if (z) {
            x0078xx0078x0078.ddd00640064d0064(2, str, str2);
        }
    }

    public static final void w(String str, String str2) {
        if (x007800780078xx0078) {
            x0078xx0078x0078.ddd00640064d0064(5, str, str2);
            int i = hh0068hhhh0068;
            if (((hhh0068hhh0068 + i) * i) % h0068h0068hhh0068 != h006800680068hhh0068) {
                hh0068hhhh0068 = hh00680068hhh0068();
                h006800680068hhh0068 = hh00680068hhh0068();
            }
        }
    }

    public void finalize() throws Throwable {
        OutputStream outputStream = this.xx0078x0078x0078;
        int i = hh0068hhhh0068;
        if (((hhh0068hhh0068 + i) * i) % h0068h0068hhh0068 != h006800680068hhh0068) {
            hh0068hhhh0068 = hh00680068hhh0068();
            h006800680068hhh0068 = 95;
        }
        if (outputStream != null) {
            this.xx0078x0078x0078.close();
        }
        super.finalize();
    }

    public static final void e(String str, String str2, Throwable th) {
        if (xx00780078xx0078) {
            LogBridge logBridge = x0078xx0078x0078;
            int i = hh0068hhhh0068;
            if (((hhh0068hhh0068 + i) * i) % h0068h0068hhh0068 != h006800680068hhh0068) {
                hh0068hhhh0068 = hh00680068hhh0068();
                h006800680068hhh0068 = hh00680068hhh0068();
            }
            logBridge.d0064d00640064d0064(6, str, str2, th);
        }
    }

    public static final void init(Context context, int i) {
        LogBridge logBridge = new LogBridge(context);
        int i2 = hh0068hhhh0068;
        if (((hhh0068hhh0068 + i2) * i2) % h0068h0068hhh0068 != h006800680068hhh0068) {
            hh0068hhhh0068 = 72;
            h006800680068hhh0068 = 67;
        }
        x0078xx0078x0078 = logBridge;
        xx00780078xx0078 = true;
        x007800780078xx0078 = true;
        x00780078xxx0078 = false;
        xxx0078xx0078 = false;
        x0078x0078xx0078 = false;
    }

    public static final void w(String str, String str2, Throwable th) {
        int i = hh0068hhhh0068;
        if (((hhh0068hhh0068 + i) * i) % h0068h0068hhh0068 != 0) {
            hh0068hhhh0068 = hh00680068hhh0068();
            h006800680068hhh0068 = hh00680068hhh0068();
        }
        if (x007800780078xx0078) {
            x0078xx0078x0078.d0064d00640064d0064(5, str, str2, th);
        }
    }

    public static final void w(String str, Throwable th) {
        int i = hh0068hhhh0068;
        if (((hhh0068hhh0068 + i) * i) % hhhh0068hh0068() != h006800680068hhh0068) {
            hh0068hhhh0068 = hh00680068hhh0068();
            h006800680068hhh0068 = 13;
        }
        if (x007800780078xx0078) {
            x0078xx0078x0078.d0064d00640064d0064(5, str, null, th);
        }
    }
}
