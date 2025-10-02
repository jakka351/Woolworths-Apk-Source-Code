package com.behaviosec.rl;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.behaviosec.rl.android.LogBridge;
import com.behaviosec.rl.android.SyncedJSONArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class ododooo {
    public static int p0070007000700070p0070p = 84;
    public static int p00700070pp00700070p = 0;
    public static int p0070ppp00700070p = 2;
    public static int ppp0070p00700070p = 1;
    public SyncedJSONArray p0070007000700070p0070 = new SyncedJSONArray();
    private PendingIntent p0070p00700070p0070;
    private ActivityRecognitionReceiver pp007000700070p0070;
    private boolean ppp00700070p0070;
    private final Context ppppp00700070;
    private static final String pp0070p0070p0070 = uuxuuuu.pp0070p0070ppp("b\u001b\u0006Q8A%\u007f3\u001c4\u0015fDY:\bc=1(\u0007ahL\u0019~", (char) (yyyllll.rrrr007200720072() ^ 383821941), (char) (yllylll.r007200720072r00720072() ^ (-1146716912)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791)));
    private static final String p00700070p0070p0070 = uuxuuuu.pppp0070ppp("}DpM\n_:s9\u0011\u0019z\u001d!k\u001b;\u000bv\b>xGY\u0019pQ\u000b]U#\u0017_DI\u0019\u0002LJ3-H\u000b\u0010^\u007f\nf\n\u001a@z", (char) (yllylll.r007200720072r00720072() ^ (-1146716912)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741334)));

    public class ActivityRecognitionReceiver extends BroadcastReceiver {
        public static int p00700070pp0070p0070 = 2;
        public static int p0070p0070p0070p0070 = 0;
        public static int pp0070pp0070p0070 = 1;
        public static int ppppp0070p0070 = 77;

        private ActivityRecognitionReceiver() {
        }

        private void j006A006A006Aj006A006A(ActivityTransitionEvent activityTransitionEvent) {
            if (ododooo.this.p0070007000700070p0070 != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(SystemClock.uptimeMillis());
                jSONArray.put(activityTransitionEvent.getActivityType());
                ododooo.this.p0070007000700070p0070.put(jSONArray);
            }
        }

        private void jjjj006A006A006A(ActivityTransitionResult activityTransitionResult) {
            Iterator<ActivityTransitionEvent> it = activityTransitionResult.getTransitionEvents().iterator();
            while (it.hasNext()) {
                j006A006A006Aj006A006A(it.next());
                if (((pp00700070p0070p0070() + ppppp0070p0070) * ppppp0070p0070) % p00700070pp0070p0070 != p0070p0070p0070p0070) {
                    ppppp0070p0070 = 61;
                    p0070p0070p0070p0070 = 55;
                }
            }
        }

        public static int p0070ppp0070p0070() {
            return 0;
        }

        public static int pp00700070p0070p0070() {
            return 1;
        }

        public static int ppp0070p0070p0070() {
            return 15;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ActivityTransitionResult activityTransitionResultExtractResult;
            int i = ppppp0070p0070;
            if (((pp0070pp0070p0070 + i) * i) % p00700070pp0070p0070 != p0070ppp0070p0070()) {
                ppppp0070p0070 = ppp0070p0070p0070();
                pp0070pp0070p0070 = 46;
            }
            if (TextUtils.equals(uuxuuuu.pppp0070ppp("Vcb$Y]a[qelqdc/to2ftkzxso`_O]cZf\\ccivj^]`escq\u007fbewmtt", (char) (yyyllll.rrrr007200720072() ^ 383821913), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))), intent.getAction()) && ActivityTransitionResult.hasResult(intent) && (activityTransitionResultExtractResult = ActivityTransitionResult.extractResult(intent)) != null) {
                jjjj006A006A006A(activityTransitionResultExtractResult);
            }
        }
    }

    public ododooo(Context context) throws ClassNotFoundException {
        this.ppppp00700070 = context;
        vv00760076vvv();
    }

    public static /* synthetic */ ActivityRecognitionReceiver j006A006Aj006A006A006A(ododooo ododoooVar) {
        int i = p0070007000700070p0070p;
        if (((ppp0070p00700070p + i) * i) % p0070ppp00700070p != 0) {
            p0070007000700070p0070p = 36;
            p00700070pp00700070p = pp0070pp00700070p();
        }
        return ododoooVar.pp007000700070p0070;
    }

    private ActivityTransitionRequest j006Aj006A006A006A006A() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ActivityTransition.Builder().setActivityType(3).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(3).setActivityTransition(1).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(7).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(7).setActivityTransition(1).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(0).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(0).setActivityTransition(1).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(1).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(1).setActivityTransition(1).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(8).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(8).setActivityTransition(1).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(2).setActivityTransition(0).build());
        ActivityTransition.Builder builder = new ActivityTransition.Builder();
        int i = p0070007000700070p0070p;
        if (((ppp0070p00700070p + i) * i) % p0070ppp00700070p != p00700070pp00700070p) {
            p0070007000700070p0070p = 88;
            p00700070pp00700070p = pp0070pp00700070p();
        }
        arrayList.add(builder.setActivityType(2).setActivityTransition(1).build());
        return new ActivityTransitionRequest(arrayList);
    }

    public static /* synthetic */ PendingIntent j006Ajj006A006A006A(ododooo ododoooVar) {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                p0070007000700070p0070p = 68;
                while (true) {
                    try {
                        int[] iArr2 = new int[-1];
                    } catch (Exception unused2) {
                        p0070007000700070p0070p = 97;
                        return ododoooVar.p0070p00700070p0070;
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean jj006Aj006A006A006A(ododooo ododoooVar, boolean z) {
        int i = p0070007000700070p0070p;
        if (((ppp0070p00700070p + i) * i) % p0070ppp00700070p != 0) {
            p0070007000700070p0070p = 78;
            p00700070pp00700070p = pp0070pp00700070p();
        }
        ododoooVar.ppp00700070p0070 = z;
        return z;
    }

    public static /* synthetic */ Context jjj006A006A006A006A(ododooo ododoooVar) {
        try {
            throw null;
        } catch (Exception unused) {
            p0070007000700070p0070p = 82;
            return ododoooVar.ppppp00700070;
        }
    }

    public static int pp0070pp00700070p() {
        return 48;
    }

    public static int ppppp00700070p() {
        return 1;
    }

    @SuppressLint
    private void v00760076vvvv() {
        Context context = this.ppppp00700070;
        if (context == null || !v0076vvvvv(context)) {
            this.ppp00700070p0070 = false;
            return;
        }
        ActivityTransitionRequest activityTransitionRequestJ006Aj006A006A006A006A = j006Aj006A006A006A006A();
        ActivityRecognitionClient client = ActivityRecognition.getClient(this.ppppp00700070);
        this.pp007000700070p0070 = new ActivityRecognitionReceiver();
        if (this.ppppp00700070.getApplicationInfo().targetSdkVersion < 34 || Build.VERSION.SDK_INT < 33) {
            this.ppppp00700070.registerReceiver(this.pp007000700070p0070, new IntentFilter(uuxuuuu.pppp0070ppp("p}|>sw{u\f\u007f\u0007\f~}I\u000f\nL\u0001\u000f\u0006\u0015\u0013\u000e\nzyiw}t\u0001v}}\u0004\u0011\u0005xwz\u007f\u000e}\f\u001a|\u007f\u0012\b\u000f\u000f", (char) (yyyllll.rrrr007200720072() ^ 383821991), (char) (yllylll.r007200720072r00720072() ^ (-1146716787)))));
        } else {
            this.ppppp00700070.registerReceiver(this.pp007000700070p0070, new IntentFilter(uuxuuuu.pppp0070ppp("\u0006\u0013\u0012S\t\r\u0011\u000b!\u0015\u001c!\u0014\u0013^$\u001fa\u0016$\u001b*(#\u001f\u0010\u000f~\r\u0013\n\u0016\f\u0013\u0013\u0019&\u001a\u000e\r\u0010\u0015#\u0013!/\u0012\u0015'\u001d$$", (char) (yyyllll.rrrr007200720072() ^ 383822068), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)))), 4);
        }
        try {
            Intent intent = new Intent(uuxuuuu.pppp0070ppp("T_\\\u001cOQSK_QVYJG\u0011TM\u000e@LANJC=,)\u0017#'\u001c&\u001a\u001f\u001d!,\u001e\u0010\r\u000e\u0011\u001d\u000b\u0017#\u0004\u0005\u0015\t\u000e\f", (char) (ylyylll.r0072rrr00720072() ^ (-1691741338)), (char) (yyyllll.rrrr007200720072() ^ 383821868)));
            intent.setPackage(this.ppppp00700070.getPackageName());
            int i = p0070007000700070p0070p;
            if (((ppp0070p00700070p + i) * i) % p0070ppp00700070p != p00700070pp00700070p) {
                p0070007000700070p0070p = pp0070pp00700070p();
                p00700070pp00700070p = pp0070pp00700070p();
            }
            this.p0070p00700070p0070 = PendingIntent.getBroadcast(this.ppppp00700070, 0, intent, 33554432);
            Object objInvoke = client.getClass().getMethod(uuxuuuu.pppp0070ppp("RDORANN\u001a;K?K=GK%B0<@5?386\u001c6)%7'4", (char) (yllylll.r007200720072r00720072() ^ (-1146716775)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))), ActivityTransitionRequest.class, PendingIntent.class).invoke(client, activityTransitionRequestJ006Aj006A006A006A006A, this.p0070p00700070p0070);
            if (objInvoke instanceof Task) {
                Task task = (Task) objInvoke;
                task.addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.behaviosec.rl.ododooo.1
                    public static int p007000700070007000700070p = 1;
                    public static int pp00700070007000700070p = 0;
                    public static int ppppppp0070 = 2;

                    public static int p0070p0070007000700070p() {
                        return 63;
                    }

                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public /* bridge */ /* synthetic */ void onSuccess(Void r3) {
                        Void r32 = r3;
                        if ((p0070p0070007000700070p() * (p0070p0070007000700070p() + p007000700070007000700070p)) % ppppppp0070 != pp00700070007000700070p) {
                            pp00700070007000700070p = 59;
                        }
                        onSuccess2(r32);
                    }

                    /* renamed from: onSuccess, reason: avoid collision after fix types in other method */
                    public void onSuccess2(Void r5) {
                        ododooo.j006Ajj006A006A006A(ododooo.this).cancel();
                        ododooo.jj006Aj006A006A006A(ododooo.this, true);
                        while (true) {
                            try {
                                int[] iArr = new int[-1];
                            } catch (Exception unused) {
                                LogBridge.i(uuxuuuu.pp0070p0070ppp("\u00112B6B4>B\u001a,)4+1+5).,\t%..\u001e&\u001c(", (char) (yylylll.r0072r0072r00720072() ^ (-1349847248)), (char) (yyyllll.rrrr007200720072() ^ 383822016), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), uuxuuuu.pp0070p0070ppp(".\u0001TEnYHaL?hy~b@Z\u00175+<4*|!\u0007\n.\u0005x$\by\u0004\u000bbHnmRgY@c\u0012", (char) (yllylll.r007200720072r00720072() ^ (-1146716753)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847260)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))));
                                return;
                            }
                        }
                    }
                });
                task.addOnFailureListener(new OnFailureListener() { // from class: com.behaviosec.rl.ododooo.2
                    public static int p00700070pppp0070 = 1;
                    public static int p0070ppppp0070 = 50;
                    public static int pp0070pppp0070 = 0;
                    public static int ppp0070ppp0070 = 2;

                    public static int p0070p0070ppp0070() {
                        return 53;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public void onFailure(Exception exc) {
                        ododooo.jjj006A006A006A006A(ododooo.this).unregisterReceiver(ododooo.j006A006Aj006A006A006A(ododooo.this));
                        ododooo.jj006Aj006A006A006A(ododooo.this, false);
                        int i2 = p0070ppppp0070;
                        if (((p00700070pppp0070 + i2) * i2) % ppp0070ppp0070 != pp0070pppp0070) {
                            p0070ppppp0070 = p0070p0070ppp0070();
                            pp0070pppp0070 = 66;
                        }
                        LogBridge.e(uuxuuuu.pp0070p0070ppp("z2\b1\f}\f\b*Ury`|2QrWs;z\u007f>@cG\u0016", (char) (yylylll.r0072r0072r00720072() ^ (-1349847093)), (char) (yyyllll.rrrr007200720072() ^ 383822065), (char) (yllylll.r007200720072r00720072() ^ (-1146716789))), uuxuuuu.pp0070p0070ppp("\u0004FG]L\u0002b\u000eH2!{yKX{nNno<\t9RX_t\u001e4&\u007fNJe\u0019[M<F\u0019", (char) (yylylll.r0072r0072r00720072() ^ (-1349847204)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847271)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))), exc);
                    }
                });
            }
        } catch (SecurityException e) {
            LogBridge.w(uuxuuuu.pp0070p0070ppp("]~\u000f\u0003\u000f\u0001\u000b\u000ffxu\u0001w}w\u0002uzxUqzzjrht", (char) (ylyylll.r0072rrr00720072() ^ (-1691741362)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847223)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741329))), uuxuuuu.pppp0070ppp("\u00154'5c(.(60//k=3A=:EF=DDvKM;OQP", (char) (yylylll.r0072r0072r00720072() ^ (-1349847194)), (char) (yyyllll.rrrr007200720072() ^ 383821866)) + e.toString());
        } catch (Throwable th) {
            LogBridge.i(uuxuuuu.pppp0070ppp("\u0014p.@c\u001a\u0007a\u007f$\"N\u0018\u0013gR\u0003\u00159\u001d\u007f/\u0010zyJ3", (char) (ylyylll.r0072rrr00720072() ^ (-1691741381)), (char) (yyyllll.rrrr007200720072() ^ 383821864)), uuxuuuu.pppp0070ppp("% xVMuKNmU\u0010\u0011dipE\u0010\u000bU\u0014h0 \u000ej?*j8'ns\"A\u0019\\\u007f%", (char) (yllylll.r007200720072r00720072() ^ (-1146716696)), (char) (yllylll.r007200720072r00720072() ^ (-1146716790))) + th);
        }
    }

    public static boolean v0076vvvvv(Context context) throws Exception {
        char cR007200720072r00720072;
        char cR007200720072r007200722;
        String str;
        int i = p0070007000700070p0070p;
        if (((ppp0070p00700070p + i) * i) % p0070ppp00700070p != p00700070pp00700070p) {
            p0070007000700070p0070p = pp0070pp00700070p();
            p00700070pp00700070p = 88;
        }
        try {
            PackageManager packageManager = (PackageManager) Class.forName(uuxuuuu.pp0070p0070ppp("\u0004G|F\u007fX\u001d\u0004.`g*p\u001be\u001cXTU^t/q", (char) (yylylll.r0072r0072r00720072() ^ (-1349847088)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741302)), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)))).getMethod(uuxuuuu.pppp0070ppp("\t\u0006\u0018r\u0007\b\u0013\b\u0011\u000ex\f\u001c\u000e\u0017\u0014$", (char) (yyyllll.rrrr007200720072() ^ 383821941), (char) (ylyylll.r0072rrr00720072() ^ (-1691741344))), null).invoke(context, null);
            if (Build.VERSION.SDK_INT >= 29) {
                cR007200720072r00720072 = (char) (yyyllll.rrrr007200720072() ^ 383822021);
                cR007200720072r007200722 = (char) (ylyylll.r0072rrr00720072() ^ (-1691741336));
                str = "1?6EC>:\u0005H>LHEPQHOO\u0010$'9/=1=CJ>21>7?;G=DD";
            } else {
                cR007200720072r00720072 = (char) (yllylll.r007200720072r00720072() ^ (-1146716775));
                cR007200720072r007200722 = (char) (yllylll.r007200720072r00720072() ^ (-1146716788));
                str = "s\u0001\u007fA{\u0005\u0006~\u0005~H|\u000b\u0002\u0011\u000fie0jqx4wm{wt\u007f\u0001w~\u001f_sv\t~\r\u0001\r\u0013\u001a\u000e\u0002\u0001\u000e\u0007njvlss";
            }
            return packageManager.checkPermission(uuxuuuu.pppp0070ppp(str, cR007200720072r00720072, cR007200720072r007200722), context.getPackageName()) == 0;
        } catch (InvocationTargetException e) {
            throw e.getCause();
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void vv00760076vvv() throws ClassNotFoundException {
        if (v0076vvvvv(this.ppppp00700070)) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (ContextCompat.a(this.ppppp00700070, i >= 29 ? uuxuuuu.pppp0070ppp("\u001d)\u001e+' \u001ab$\u0018$\u001e\u0019\"!\u0016\u001b\u0019Wijznzlvz\u007fqc`kbhbl`ec", (char) (yyyllll.rrrr007200720072() ^ 383821962), (char) ((-1691741335) ^ ylyylll.r0072rrr00720072())) : uuxuuuu.pp0070p0070ppp("LYX\u001aT]^WMG\u0011ESJYWb^)cjq-pVd`]hi`g7w\f\u000f!\u0017%\u0019\u0015\u001b\"\u0016\n\t\u0016\u000f'#/%,,", (char) (yyyllll.rrrr007200720072() ^ 383821884), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336)), (char) ((-1691741335) ^ ylyylll.r0072rrr00720072()))) == 0) {
                    Class.forName(uuxuuuu.pppp0070ppp("\u0002\u000f\u000eO\n\u0013\u0014\r\u0013\rV\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0019 'b\u0019&%&))i\u0004-.'-'\u00044.\u0007=)26,.6:8DJ", (char) (yyyllll.rrrr007200720072() ^ 383821877), (char) (yylylll.r0072r0072r00720072() ^ (-1349847050))));
                    if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.ppppp00700070) == 0) {
                        Class.forName(uuxuuuu.pppp0070ppp("r\u007fz<r{xqsm3gqhsq\t\u0005K\u0006\t\u0010G\u0007\u0007{v\u000b|\u0004\u007f@p\u0014\"\u0018\"\u0016\u001e${\u001b\u0007\u0015\u0017\u000e\u0016\f//", (char) (yylylll.r0072r0072r00720072() ^ (-1349847172)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741332))));
                        v00760076vvvv();
                        return;
                    } else {
                        LogBridge.i(uuxuuuu.pp0070p0070ppp("7v/c`8?k\u001b\u00055\u007fZ\u0007C\u000b$o\u001fq&.sp`)}", (char) (yylylll.r0072r0072r00720072() ^ (-1349847178)), (char) (yllylll.r007200720072r00720072() ^ (-1146716768)), (char) ((-1349847050) ^ yylylll.r0072r0072r00720072())), uuxuuuu.pppp0070ppp("M=Kg%Jl\u000e\b^rxw\n\u0011x9'rvb\u000bs~\n%\u001a>:\rcH4\u0011\u0013", (char) (yllylll.r007200720072r00720072() ^ (-1146716683)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847052))));
                        this.ppp00700070p0070 = false;
                        return;
                    }
                }
                LogBridge.i(uuxuuuu.pppp0070ppp("Fi{q\u007fs\u007f\u0006_sr\u007fx\u0001|\t~\u0006\u0006d\u0003\u000e\u0010\u0002\f\u0004\u0012", (char) (ylyylll.r0072rrr00720072() ^ (-1691741371)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), uuxuuuu.pppp0070ppp("CFXN\\P\\bi]QP]V^Zf\\cc6\b}\f\b\u0005\u0010\u0011\b\u000f\u000fA\u0011\u0013\u0019E\u000e\u001a\n\u0018\u001f\u0011\u0011MV", (char) (yyyllll.rrrr007200720072() ^ 383821995), (char) (ylyylll.r0072rrr00720072() ^ (-1691741343))) + i + uuxuuuu.pppp0070ppp("bh", (char) (yylylll.r0072r0072r00720072() ^ (-1349847200)), (char) ((-1691741336) ^ ylyylll.r0072rrr00720072())));
                this.ppp00700070p0070 = false;
                int i2 = p0070007000700070p0070p;
                if (((ppppp00700070p() + i2) * i2) % p0070ppp00700070p != 0) {
                    p0070007000700070p0070p = 2;
                    p0070ppp00700070p = pp0070pp00700070p();
                }
            } catch (ClassNotFoundException unused) {
                LogBridge.i(uuxuuuu.pp0070p0070ppp("#\bVx\u0017G\ferf\u0011*=a$COV-W`$ce\u001fr\u0014", (char) (ylyylll.r0072rrr00720072() ^ (-1691741209)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847294)), (char) (yyyllll.rrrr007200720072() ^ 383821871)), uuxuuuu.pp0070p0070ppp("\t{F\t\\ $#\nI,!\u001ezV%b'vOFc/~w\u0004c\u0019o={K cv", (char) (ylyylll.r0072rrr00720072() ^ (-1691741271)), (char) (yllylll.r007200720072r00720072() ^ (-1146716734)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))));
                this.ppp00700070p0070 = false;
            }
        }
    }

    private void vvv0076vvv() {
        Context context = this.ppppp00700070;
        if (context == null || !v0076vvvvv(context)) {
            return;
        }
        if (this.p0070p00700070p0070 != null) {
            ActivityRecognitionClient client = ActivityRecognition.getClient(this.ppppp00700070);
            try {
                Object objInvoke = client.getClass().getMethod(uuxuuuu.pp0070p0070ppp("l\u001ed%j\u00182\u0013b\u0016a\u0013\\ 9\u0016C\u000fR\u0007P\u0004H\u0006+\u00057rDs@", (char) (ylyylll.r0072rrr00720072() ^ (-1691741329)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741271)), (char) (yyyllll.rrrr007200720072() ^ 383821867)), PendingIntent.class).invoke(client, this.p0070p00700070p0070);
                if (objInvoke instanceof Task) {
                    Task task = (Task) objInvoke;
                    task.addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.behaviosec.rl.ododooo.3
                        public static int p007000700070ppp0070 = 1;
                        public static int p0070pp0070pp0070 = 0;
                        public static int pp00700070ppp0070 = 68;
                        public static int pppp0070pp0070 = 2;

                        public static int pp0070p0070pp0070() {
                            return 8;
                        }

                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public /* bridge */ /* synthetic */ void onSuccess(Void r3) {
                            Void r32 = r3;
                            int i = pp00700070ppp0070;
                            if (((p007000700070ppp0070 + i) * i) % pppp0070pp0070 != p0070pp0070pp0070) {
                                pp00700070ppp0070 = pp0070p0070pp0070();
                                p0070pp0070pp0070 = 74;
                            }
                            onSuccess2(r32);
                        }

                        /* renamed from: onSuccess, reason: avoid collision after fix types in other method */
                        public void onSuccess2(Void r5) {
                            ododooo.j006Ajj006A006A006A(ododooo.this).cancel();
                            LogBridge.i(uuxuuuu.pp0070p0070ppp(";^pfthtzThgtmuq}szzYw\u0003\u0005v\u0001x\u0007", (char) (yyyllll.rrrr007200720072() ^ 383821891), (char) (ylyylll.r0072rrr00720072() ^ (-1691741433)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741336))), uuxuuuu.pp0070p0070ppp("Ku\u007f\u001a(~\u0005dB\u0019e\u0015\\IpZ\u0013q5+[n20\u001e>s\u0016\u00061nE\u000f7.\u000fFF", (char) (yyyllll.rrrr007200720072() ^ 383821935), (char) (yyyllll.rrrr007200720072() ^ 383821873), (char) (yyyllll.rrrr007200720072() ^ 383821871)));
                        }
                    });
                    task.addOnFailureListener(new OnFailureListener() { // from class: com.behaviosec.rl.ododooo.4
                        public static int p00700070p0070pp0070 = 88;
                        public static int pp007000700070pp0070 = 2;
                        public static int ppp00700070pp0070;

                        public static int p0070007000700070pp0070() {
                            return 81;
                        }

                        public static int p0070p00700070pp0070() {
                            return 1;
                        }

                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public void onFailure(Exception exc) {
                            if (((p0070p00700070pp0070() + p00700070p0070pp0070) * p00700070p0070pp0070) % pp007000700070pp0070 != ppp00700070pp0070) {
                                p00700070p0070pp0070 = 57;
                                ppp00700070pp0070 = p0070007000700070pp0070();
                            }
                            LogBridge.e(uuxuuuu.pppp0070ppp("\u0012n0Be\u001c\u0011S}\"$L\u001a\u0011\u0002(\u0001\u0017;\u001f}1\u0016\u0001{L9", (char) (yyyllll.rrrr007200720072() ^ 383821947), (char) (yyyllll.rrrr007200720072() ^ 383821864)), uuxuuuu.pppp0070ppp("=\\LZ`WcY``f\u0014Xeld]\u001aikq\u001eae!wqvjmp{}o}qq<", (char) (yyyllll.rrrr007200720072() ^ 383822055), (char) (yyyllll.rrrr007200720072() ^ 383821866)), exc);
                        }
                    });
                }
            } catch (SecurityException e) {
                String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\u001ac\t#-\u000fLW\nGr\f~L\u0002\"\u0012\u000bvQYU\u0006.\u0002;\u001c", (char) (yyyllll.rrrr007200720072() ^ 383821939), (char) ((-1349847240) ^ yylylll.r0072r0072r00720072()), (char) (yllylll.r007200720072r00720072() ^ (-1146716789)));
                StringBuilder sb = new StringBuilder();
                char cRrrr007200720072 = (char) (yyyllll.rrrr007200720072() ^ 383821974);
                int iR0072rrr00720072 = ylyylll.r0072rrr00720072();
                if ((pp0070pp00700070p() * (pp0070pp00700070p() + ppp0070p00700070p)) % p0070ppp00700070p != p00700070pp00700070p) {
                    p0070007000700070p0070p = 44;
                    p00700070pp00700070p = 44;
                }
                sb.append(uuxuuuu.pppp0070ppp("\u001a7(4`#'\u001f+# \u001eX(\u001c(\"\u001d&%\u001a\u001f\u001dM  \f\u001e\u001e\u001b", cRrrr007200720072, (char) (iR0072rrr00720072 ^ (-1691741333))));
                sb.append(e.toString());
                LogBridge.w(strPp0070p0070ppp, sb.toString());
            } catch (Throwable th) {
                LogBridge.i(uuxuuuu.pp0070p0070ppp("\r\u0005\u0013a[G0*s\\[<\"\"y~`?<n||^D;\u000b\u0015", (char) ((-1349847240) ^ yylylll.r0072r0072r00720072()), (char) (yylylll.r0072r0072r00720072() ^ (-1349847144)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741330))), uuxuuuu.pppp0070ppp("\u0012/;::>h=:+d\u0005&6*6(26\u000e \u001d(\u001f%\u001f)\u001d\" |\u0019\"\"\u0012\u001a\u0010\u001c", (char) (yyyllll.rrrr007200720072() ^ 383822076), (char) (ylyylll.r0072rrr00720072() ^ (-1691741335))) + th);
            }
        }
        ActivityRecognitionReceiver activityRecognitionReceiver = this.pp007000700070p0070;
        if (activityRecognitionReceiver != null) {
            this.ppppp00700070.unregisterReceiver(activityRecognitionReceiver);
            this.pp007000700070p0070 = null;
        }
    }

    public void jj006A006A006A006A006A() {
        this.p0070007000700070p0070.clear();
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                p0070007000700070p0070p = 17;
                return;
            }
        }
    }

    public void v007600760076vvv() {
        if (this.ppp00700070p0070 && v0076vvvvv(this.ppppp00700070)) {
            vvv0076vvv();
        }
    }

    public JSONArray v0076v0076vvv() {
        JSONArray jSONArray = this.p0070007000700070p0070.getJSONArray();
        if ((pp0070pp00700070p() * (pp0070pp00700070p() + ppp0070p00700070p)) % p0070ppp00700070p != p00700070pp00700070p) {
            p0070007000700070p0070p = 36;
            p00700070pp00700070p = pp0070pp00700070p();
        }
        return jSONArray;
    }

    public void vv0076vvvv() {
        if (this.ppp00700070p0070 && v0076vvvvv(this.ppppp00700070)) {
            v00760076vvvv();
            int i = p0070007000700070p0070p;
            if (((ppp0070p00700070p + i) * i) % p0070ppp00700070p != 0) {
                p0070007000700070p0070p = pp0070pp00700070p();
                p00700070pp00700070p = 21;
            }
        }
    }
}
