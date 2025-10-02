package com.behaviosec.rl;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.behaviosec.rl.android.BehavioButtonTouchListener;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.yylyyyy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class yllyyyl {
    public static int c0063c0063cccc = 1;
    public static int cc00630063cccc = 2;
    public static int cc0063c0063ccc = 0;
    public static int ccc0063cccc = 75;
    private static final int i00690069i0069ii = 100;
    private static final String i0069ii0069ii;
    private static final int ii0069i0069ii = 100;
    public ViewGroup i00690069ii0069i;
    private boolean i0069iii0069i;
    public ViewGroup iii0069i0069i;
    private final ExecutorService iii00690069ii = Executors.newSingleThreadExecutor();
    private BehavioButtonTouchListener i0069i00690069ii = null;
    private Queue<JSONArray> ii006900690069ii = new ConcurrentLinkedQueue();
    private Queue<JSONArray> i0069006900690069ii = new ConcurrentLinkedQueue();
    private final Map<Integer, yylyyyy.yllyyyy> iiiii0069i = new LinkedHashMap();
    private final yyllyyl ii0069ii0069i = new yyllyyl();

    public class yyllyyl {
        public static int c006300630063c0063cc = 1;
        public static int c0063c0063c0063cc = 62;
        public static int cc00630063c0063cc = 0;
        public static int cccc00630063cc = 2;
        private Queue<JSONArray> iiii00690069i = new yylylyy(100);

        public yyllyyl() {
        }

        public static int c0063cc00630063cc() {
            return 19;
        }

        public static /* synthetic */ Queue k006Bkk006B006Bk(yyllyyl yyllyylVar) {
            if ((c0063cc00630063cc() * (c0063cc00630063cc() + c006300630063c0063cc)) % cccc00630063cc != cc00630063c0063cc) {
                c0063c0063c0063cc = 53;
                cc00630063c0063cc = c0063cc00630063cc();
            }
            return yyllyylVar.iiii00690069i;
        }

        public void k006B006Bk006B006Bk(List<yylyyyy> list, int i) {
            int size = list.size();
            int i2 = size - 1;
            int i3 = 0;
            long j = (list.get(i2).t00740074tt00740074 - list.get(0).t00740074tt00740074) / i;
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(list.get(0).d0064ddd0064d());
            long j2 = list.get(0).t00740074tt00740074;
            if (j < 1) {
                return;
            }
            while (i3 < size - 2) {
                yylyyyy yylyyyyVar = list.get(i3);
                int i4 = i3 + 1;
                yylyyyy yylyyyyVar2 = list.get(i4);
                if (yylyyyyVar.t00740074tt00740074 <= j2 && j2 < yylyyyyVar2.t00740074tt00740074) {
                    int i5 = c0063c0063c0063cc;
                    if (((c006300630063c0063cc + i5) * i5) % cccc00630063cc != cc00630063c0063cc) {
                        c0063c0063c0063cc = c0063cc00630063cc();
                        cc00630063c0063cc = 70;
                    }
                    jSONArray.put(yylyyyy.dd006400640064dd(yylyyyyVar, yylyyyyVar2, j2).d0064ddd0064d());
                    j2 += j;
                } else if (j2 >= yylyyyyVar2.t00740074tt00740074) {
                    i3 = i4;
                }
            }
            jSONArray.put(list.get(i2).d0064ddd0064d());
            this.iiii00690069i.add(jSONArray);
        }

        public JSONArray k006Bk006B006B006Bk() {
            try {
                return (JSONArray) yllyyyl.this.iii00690069ii.submit(new Callable<JSONArray>() { // from class: com.behaviosec.rl.yllyyyl.yyllyyl.1
                    public static int c00630063006300630063cc = 2;
                    public static int c0063c006300630063cc = 0;
                    public static int cc0063006300630063cc = 1;
                    public static int ccc006300630063cc = 54;

                    public static int cccccc0063c() {
                        return 25;
                    }

                    @Override // java.util.concurrent.Callable
                    public /* bridge */ /* synthetic */ JSONArray call() throws Exception {
                        int i = ccc006300630063cc;
                        if (((cc0063006300630063cc + i) * i) % c00630063006300630063cc != c0063c006300630063cc) {
                            ccc006300630063cc = cccccc0063c();
                            c0063c006300630063cc = cccccc0063c();
                        }
                        return call2();
                    }

                    @Override // java.util.concurrent.Callable
                    /* renamed from: call, reason: avoid collision after fix types in other method */
                    public JSONArray call2() {
                        try {
                            throw null;
                        } catch (Exception unused) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = yyllyyl.k006Bkk006B006Bk(yyllyyl.this).iterator();
                            while (it.hasNext()) {
                                jSONArray.put((JSONArray) it.next());
                            }
                            return jSONArray;
                        }
                    }
                }).get();
            } catch (InterruptedException | ExecutionException e) {
                LogBridge.e(uuxuuuu.pp0070p0070ppp("\u000fDYViM\u000e\f#@'Skss\f\u00159", (char) (ylyylll.r0072rrr00720072() ^ (-1691741267)), (char) (yllylll.r007200720072r00720072() ^ (-1146716826)), (char) (yyyllll.rrrr007200720072() ^ 383821867)), e.getMessage(), e);
                return new JSONArray();
            }
        }

        public void kk006Bk006B006Bk(List<yylyyyy> list) {
            JSONArray jSONArray = new JSONArray();
            Iterator<yylyyyy> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().d0064ddd0064d());
            }
            this.iiii00690069i.add(jSONArray);
            int i = c0063c0063c0063cc;
            if (((c006300630063c0063cc + i) * i) % cccc00630063cc != cc00630063c0063cc) {
                c0063c0063c0063cc = c0063cc00630063cc();
                cc00630063c0063cc = c0063cc00630063cc();
            }
        }

        public void kkk006B006B006Bk() {
            int i = c0063c0063c0063cc;
            if (((c006300630063c0063cc + i) * i) % cccc00630063cc != cc00630063c0063cc) {
                c0063c0063c0063cc = c0063cc00630063cc();
                cc00630063c0063cc = 81;
            }
            this.iiii00690069i.clear();
        }
    }

    public class yyyylyl implements Runnable {
        private final boolean i00690069i00690069i;
        private final List<yylyyyy> iii006900690069i;

        private yyyylyl(yylyyyy.yllyyyy yllyyyyVar) {
            this.i00690069i00690069i = yllyyyyVar.isBsdkTouch();
            this.iii006900690069i = yllyyyyVar.getEvents();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[PHI: r1
  0x0026: PHI (r1v8 int) = (r1v5 int), (r1v6 int) binds: [B:11:0x0024, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
                java.util.List<com.behaviosec.rl.yylyyyy> r0 = r3.iii006900690069i
                int r0 = r0.size()
                com.behaviosec.rl.yllyyyl r1 = com.behaviosec.rl.yllyyyl.this
                boolean r1 = com.behaviosec.rl.yllyyyl.kk006Bkkk006B(r1)
                if (r1 == 0) goto L47
            Le:
                r1 = -1
                int[] r1 = new int[r1]     // Catch: java.lang.Exception -> L12
                goto Le
            L12:
                r1 = 10
                if (r0 > r1) goto L22
                com.behaviosec.rl.yllyyyl r0 = com.behaviosec.rl.yllyyyl.this
                com.behaviosec.rl.yllyyyl$yyllyyl r0 = com.behaviosec.rl.yllyyyl.k006B006B006B006B006Bk(r0)
                java.util.List<com.behaviosec.rl.yylyyyy> r1 = r3.iii006900690069i
                r0.kk006Bk006B006Bk(r1)
                goto L47
            L22:
                r2 = 50
                if (r0 >= r2) goto L32
            L26:
                com.behaviosec.rl.yllyyyl r0 = com.behaviosec.rl.yllyyyl.this
                com.behaviosec.rl.yllyyyl$yyllyyl r0 = com.behaviosec.rl.yllyyyl.k006B006B006B006B006Bk(r0)
                java.util.List<com.behaviosec.rl.yylyyyy> r2 = r3.iii006900690069i
                r0.k006B006Bk006B006Bk(r2, r1)
                goto L47
            L32:
                r1 = 150(0x96, float:2.1E-43)
                if (r0 >= r1) goto L42
                com.behaviosec.rl.yllyyyl r0 = com.behaviosec.rl.yllyyyl.this
                com.behaviosec.rl.yllyyyl$yyllyyl r0 = com.behaviosec.rl.yllyyyl.k006B006B006B006B006Bk(r0)
                java.util.List<com.behaviosec.rl.yylyyyy> r1 = r3.iii006900690069i
                r0.k006B006Bk006B006Bk(r1, r2)
                goto L47
            L42:
                r2 = 500(0x1f4, float:7.0E-43)
                if (r0 >= r2) goto L47
                goto L26
            L47:
                boolean r0 = r3.i00690069i00690069i
                r1 = 100
                if (r0 != 0) goto L69
                com.behaviosec.rl.yllyyyl r0 = com.behaviosec.rl.yllyyyl.this
                java.util.Queue r0 = com.behaviosec.rl.yllyyyl.kkkkkk006B(r0)
                int r0 = r0.size()
                if (r0 >= r1) goto L7c
                com.behaviosec.rl.yllyyyl r0 = com.behaviosec.rl.yllyyyl.this
                java.util.Queue r0 = com.behaviosec.rl.yllyyyl.kkkkkk006B(r0)
            L5f:
                java.util.List<com.behaviosec.rl.yylyyyy> r2 = r3.iii006900690069i
                org.json.JSONArray r1 = com.behaviosec.rl.yylyyyy.d00640064dd0064d(r2, r1)
                r0.add(r1)
                goto L7c
            L69:
                com.behaviosec.rl.yllyyyl r0 = com.behaviosec.rl.yllyyyl.this
                java.util.Queue r0 = com.behaviosec.rl.yllyyyl.k006Bkkkk006B(r0)
                int r0 = r0.size()
                if (r0 >= r1) goto L7c
                com.behaviosec.rl.yllyyyl r0 = com.behaviosec.rl.yllyyyl.this
                java.util.Queue r0 = com.behaviosec.rl.yllyyyl.k006Bkkkk006B(r0)
                goto L5f
            L7c:
                java.util.List<com.behaviosec.rl.yylyyyy> r0 = r3.iii006900690069i
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.behaviosec.rl.yllyyyl.yyyylyl.run():void");
        }
    }

    static {
        int iR0072r0072r00720072 = yylylll.r0072r0072r00720072();
        int i = ccc0063cccc;
        if (((c0063c0063cccc + i) * i) % cc00630063cccc != cc0063c0063ccc) {
            ccc0063cccc = c006300630063cccc();
            cc0063c0063ccc = 81;
        }
        i0069ii0069ii = uuxuuuu.pppp0070ppp("}\u001a!\u0010\u0016s&\u0016 '\u007f\u001e)+\u001d'\u001f-", (char) (iR0072r0072r00720072 ^ (-1349847077)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050)));
    }

    public yllyyyl(boolean z, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.i0069iii0069i = z;
        this.i00690069ii0069i = viewGroup;
        this.iii0069i0069i = viewGroup2;
    }

    public static int c006300630063cccc() {
        return 97;
    }

    public static int c00630063c0063ccc() {
        return 1;
    }

    public static int ccc00630063ccc() {
        return 0;
    }

    public static /* synthetic */ yyllyyl k006B006B006B006B006Bk(yllyyyl yllyyylVar) {
        int i = ccc0063cccc;
        if (((c0063c0063cccc + i) * i) % cc00630063cccc != 0) {
            ccc0063cccc = c006300630063cccc();
            cc0063c0063ccc = c006300630063cccc();
        }
        return yllyyylVar.ii0069ii0069i;
    }

    public static /* synthetic */ Queue k006Bkkkk006B(yllyyyl yllyyylVar) {
        Queue<JSONArray> queue = yllyyylVar.i0069006900690069ii;
        int i = ccc0063cccc;
        if (((c0063c0063cccc + i) * i) % cc00630063cccc != ccc00630063ccc()) {
            ccc0063cccc = 25;
            cc0063c0063ccc = c006300630063cccc();
        }
        return queue;
    }

    public static /* synthetic */ boolean kk006Bkkk006B(yllyyyl yllyyylVar) {
        int i = ccc0063cccc;
        if (((c00630063c0063ccc() + i) * i) % cc00630063cccc != 0) {
            ccc0063cccc = 50;
            cc0063c0063ccc = 16;
        }
        return yllyyylVar.i0069iii0069i;
    }

    public static /* synthetic */ Queue kkkkkk006B(yllyyyl yllyyylVar) {
        if ((c006300630063cccc() * (c006300630063cccc() + c0063c0063cccc)) % cc00630063cccc != cc0063c0063ccc) {
            ccc0063cccc = 19;
            cc0063c0063ccc = c006300630063cccc();
        }
        return yllyyylVar.ii006900690069ii;
    }

    public View checkIfThisIsACustomKeybEvent(MotionEvent motionEvent, int i) {
        BehavioButtonTouchListener behavioButtonTouchListener;
        int x = (int) motionEvent.getX(i);
        int y = (int) motionEvent.getY(i);
        ViewGroup viewGroup = this.iii0069i0069i;
        if (viewGroup == null) {
            viewGroup = this.i00690069ii0069i;
        }
        View viewFindViewAt = ylyylyl.findViewAt(viewGroup, x, y);
        if (viewFindViewAt == null || (behavioButtonTouchListener = this.i0069i00690069ii) == null || !behavioButtonTouchListener.n006En006Enn006E(viewFindViewAt)) {
            return null;
        }
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                ccc0063cccc = 93;
                return viewFindViewAt;
            }
        }
    }

    public void k006B006B006Bkk006B(BehavioButtonTouchListener behavioButtonTouchListener) {
        int i = ccc0063cccc;
        if (((c0063c0063cccc + i) * i) % cc00630063cccc != 0) {
            ccc0063cccc = c006300630063cccc();
            c0063c0063cccc = c006300630063cccc();
        }
        this.i0069i00690069ii = behavioButtonTouchListener;
    }

    public void k006B006Bkkk006B(int i, MotionEvent motionEvent) {
        for (Map.Entry<Integer, yylyyyy.yllyyyy> entry : this.iiiii0069i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            yylyyyy.yllyyyy value = entry.getValue();
            if (value != null) {
                int iFindPointerIndex = motionEvent.findPointerIndex(iIntValue);
                if (iFindPointerIndex == -1) {
                    int i2 = ccc0063cccc;
                    if (((c0063c0063cccc + i2) * i2) % cc00630063cccc != 0) {
                        ccc0063cccc = 72;
                        c0063c0063cccc = 77;
                    }
                } else if (i == 3) {
                    value.getEvents().addAll(yylyyyy.ddd00640064dd(motionEvent, iFindPointerIndex));
                    this.iii00690069ii.submit(new yyyylyl(value));
                } else if (i == 2 && (value.getEvents().size() == 1 || value.getEvents().get(value.getEvents().size() - 1).d0064006400640064dd(motionEvent, iFindPointerIndex))) {
                    value.getEvents().addAll(yylyyyy.ddd00640064dd(motionEvent, iFindPointerIndex));
                }
            }
        }
    }

    public void k006Bk006Bkk006B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(actionIndex);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    k006B006Bkkk006B(actionMasked, motionEvent);
                    return;
                }
                if (actionMasked == 3) {
                    k006B006Bkkk006B(actionMasked, motionEvent);
                    this.iiiii0069i.clear();
                    int i = ccc0063cccc;
                    if (((c0063c0063cccc + i) * i) % cc00630063cccc != 0) {
                        ccc0063cccc = c006300630063cccc();
                        cc0063c0063ccc = 62;
                        return;
                    }
                    return;
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        LogBridge.w(uuxuuuu.pp0070p0070ppp("\u001d9@/5\u0013E5?F\u001f=HJ<F>L", (char) (yylylll.r0072r0072r00720072() ^ (-1349847114)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847183)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))), uuxuuuu.pp0070p0070ppp("_+V\fC}#\u0007Z/b\nFw|`\u0016Q\u0006}\u001a", (char) (yyyllll.rrrr007200720072() ^ 383821857), (char) (yllylll.r007200720072r00720072() ^ (-1146716872)), (char) (yyyllll.rrrr007200720072() ^ 383821868)) + motionEvent);
                        return;
                    }
                }
            }
            kkk006Bkk006B(motionEvent, pointerId, actionIndex);
            return;
        }
        if (actionMasked == 0) {
            this.iiiii0069i.clear();
        }
        this.iiiii0069i.put(Integer.valueOf(pointerId), yylyyyy.d0064d00640064dd(motionEvent, actionIndex, checkIfThisIsACustomKeybEvent(motionEvent, actionIndex) != null));
    }

    public JSONArray k006Bkk006Bk006B() {
        yyllyyl yyllyylVar = this.ii0069ii0069i;
        int i = ccc0063cccc;
        if (((c0063c0063cccc + i) * i) % cc00630063cccc != 0) {
            ccc0063cccc = c006300630063cccc();
            cc0063c0063ccc = c006300630063cccc();
        }
        return yyllyylVar.k006Bk006B006B006Bk();
    }

    public void kk006B006Bkk006B() {
        char cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716766));
        char cR007200720072r007200722 = (char) (yllylll.r007200720072r00720072() ^ (-1146716753));
        int iR007200720072r00720072 = yllylll.r007200720072r00720072() ^ (-1146716789);
        int i = ccc0063cccc;
        if (((c0063c0063cccc + i) * i) % cc00630063cccc != 0) {
            ccc0063cccc = c006300630063cccc();
            cc0063c0063ccc = c006300630063cccc();
        }
        LogBridge.d(uuxuuuu.pp0070p0070ppp("\u007fz\f\u0002aT;c\u001dvoYw^ L\u001aD", cR007200720072r00720072, cR007200720072r007200722, (char) iR007200720072r00720072), uuxuuuu.pppp0070ppp("7m\u00174gniv\u000b", (char) (ylyylll.r0072rrr00720072() ^ (-1691741313)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))));
        this.iii00690069ii.submit(new Runnable() { // from class: com.behaviosec.rl.yllyyyl.1
            public static int c0063006300630063ccc = 1;
            public static int c0063c00630063ccc = 69;

            public static int cc006300630063ccc() {
                return 0;
            }

            public static int ccccc0063cc() {
                return 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                yllyyyl.k006B006B006B006B006Bk(yllyyyl.this).kkk006B006B006Bk();
                yllyyyl.kkkkkk006B(yllyyyl.this).clear();
                yllyyyl.k006Bkkkk006B(yllyyyl.this).clear();
            }
        });
    }

    public void kkk006Bkk006B(MotionEvent motionEvent, int i, int i2) {
        yylyyyy.yllyyyy yllyyyyVarRemove = this.iiiii0069i.remove(Integer.valueOf(i));
        if (yllyyyyVarRemove != null) {
            List<yylyyyy> events = yllyyyyVarRemove.getEvents();
            int i3 = ccc0063cccc;
            if (((c0063c0063cccc + i3) * i3) % cc00630063cccc != cc0063c0063ccc) {
                ccc0063cccc = c006300630063cccc();
                cc0063c0063ccc = c006300630063cccc();
            }
            events.addAll(yylyyyy.ddd00640064dd(motionEvent, i2));
            this.iii00690069ii.submit(new yyyylyl(yllyyyyVarRemove));
        }
    }

    public JSONArray kkkk006Bk006B(final boolean z) {
        try {
            return (JSONArray) this.iii00690069ii.submit(new Callable<JSONArray>() { // from class: com.behaviosec.rl.yllyyyl.2
                public static int c00630063cc0063cc = 2;
                public static int c0063ccc0063cc = 68;

                public static int cc0063cc0063cc() {
                    return 1;
                }

                public static int ccc0063c0063cc() {
                    return 40;
                }

                @Override // java.util.concurrent.Callable
                public JSONArray call() {
                    int i = c0063ccc0063cc;
                    if (((cc0063cc0063cc() + i) * i) % c00630063cc0063cc != 0) {
                        c0063ccc0063cc = ccc0063c0063cc();
                        c00630063cc0063cc = ccc0063c0063cc();
                    }
                    return z ? new JSONArray((Collection) yllyyyl.k006Bkkkk006B(yllyyyl.this)) : new JSONArray((Collection) yllyyyl.kkkkkk006B(yllyyyl.this));
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            LogBridge.e(uuxuuuu.pp0070p0070ppp("|\u0017\u001c\t\rh\u0019\u0007\u000f\u0014j\u0007\u0010\u0010\u007f\b}\n", (char) (yylylll.r0072r0072r00720072() ^ (-1349847290)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847149)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))), e.getMessage(), e);
            return new JSONArray();
        }
    }

    public void onAmbiguousButtonTouch(View view, MotionEvent motionEvent) {
        int i = ccc0063cccc;
        if (((c0063c0063cccc + i) * i) % cc00630063cccc != 0) {
            ccc0063cccc = 32;
            cc0063c0063ccc = 94;
        }
        this.i0069i00690069ii.onAmbiguousTouch(view, motionEvent);
    }
}
