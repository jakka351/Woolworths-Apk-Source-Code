package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.salesforce.marketingcloud.UrlHandler;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes5.dex */
public final class zzecy extends zzbso {

    @VisibleForTesting
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsm zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzecn zze;
    private String zzf;
    private String zzg;

    @VisibleForTesting
    public zzecy(Context context, zzecn zzecnVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdsm zzdsmVar) {
        this.zzb = context;
        this.zzc = zzdsmVar;
        this.zzd = zzuVar;
        this.zze = zzecnVar;
    }

    public static void zzd(Context context, zzdsm zzdsmVar, zzecn zzecnVar, String str, String str2) {
        zzk(context, zzdsmVar, zzecnVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdsm zzdsmVar, zzecn zzecnVar, String str, String str2, Map map) {
        String strZzg;
        String str3 = true != com.google.android.gms.ads.internal.zzt.zzh().zzs(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdsmVar != null) {
            zzdsl zzdslVarZza = zzdsmVar.zza();
            zzdslVarZza.zzc("gqi", str);
            zzdslVarZza.zzc(UrlHandler.ACTION, str2);
            zzdslVarZza.zzc("device_connectivity", str3);
            zzdslVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdslVarZza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            strZzg = zzdslVarZza.zzg();
        } else {
            strZzg = "";
        }
        zzecnVar.zze(new zzecp(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), str, strZzg, 2));
    }

    @VisibleForTesting
    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzgec.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzgec.zza(context, 0, intent, 201326592);
    }

    private final void zzs(final Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzl zzlVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (new NotificationManagerCompat(activity).b.areNotificationsEnabled()) {
            zzt();
            zzu(activity, zzlVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgkc.zza());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(activity);
            builderZzO.setTitle(zzx(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzect
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    this.zza.zzo(activity, zzlVar, dialogInterface, i);
                }
            }).setNegativeButton(zzx(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecu
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzp(zzlVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecv
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzq(zzlVar, dialogInterface);
                }
            });
            builderZzO.create().show();
            zzw(this.zzf, "rtsdi", zzgkc.zza());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzt() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            com.google.android.gms.ads.internal.zzt.zzc()     // Catch: android.os.RemoteException -> L20
            android.content.Context r0 = r7.zzb     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.ads.internal.util.zzbo r1 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.ads.internal.offline.buffering.zza r3 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L20
            java.lang.String r4 = r7.zzg     // Catch: android.os.RemoteException -> L20
            java.lang.String r5 = r7.zzf     // Catch: android.os.RemoteException -> L20
            java.util.Map r6 = r7.zza     // Catch: android.os.RemoteException -> L20
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.internal.ads.zzecf r6 = (com.google.android.gms.internal.ads.zzecf) r6     // Catch: android.os.RemoteException -> L20
            if (r6 != 0) goto L22
            java.lang.String r6 = ""
            goto L26
        L20:
            r0 = move-exception
            goto L40
        L22:
            java.lang.String r6 = r6.zzb()     // Catch: android.os.RemoteException -> L20
        L26:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L20
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L20
            if (r2 != 0) goto L3e
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L3c
            java.lang.String r3 = r7.zzg     // Catch: android.os.RemoteException -> L3c
            java.lang.String r4 = r7.zzf     // Catch: android.os.RemoteException -> L3c
            boolean r0 = r1.zze(r0, r3, r4)     // Catch: android.os.RemoteException -> L3c
            goto L49
        L3c:
            r0 = move-exception
            goto L41
        L3e:
            r0 = 1
            goto L49
        L40:
            r2 = 0
        L41:
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r1 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r1, r0)
            r0 = r2
        L49:
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.zzecn r0 = r7.zze
            java.lang.String r1 = r7.zzf
            r0.zzd(r1)
            java.lang.String r0 = r7.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzgkc r2 = com.google.android.gms.internal.ads.zzgkc.zza()
            r7.zzw(r0, r1, r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecy.zzt():void");
    }

    private final void zzu(Activity activity, @Nullable com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        AlertDialog alertDialogZzv = zzv(activity, zzlVar);
        alertDialogZzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzecq(this, alertDialogZzv, timer, zzlVar), 3000L);
    }

    private final AlertDialog zzv(Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzO(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecw
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzy = zzy(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzy == null) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzy, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzz = zzz();
            if (!TextUtils.isEmpty(strZzz)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzz);
            }
            zzecf zzecfVar = (zzecf) this.zza.get(this.zzf);
            Drawable drawableZzc = zzecfVar != null ? zzecfVar.zzc() : null;
            if (drawableZzc != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZzc);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i, String str) {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            return str;
        }
        try {
            return resourcesZzf.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    @Nullable
    private static XmlResourceParser zzy(int i) {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            return null;
        }
        try {
            return resourcesZzf.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Nullable
    private final String zzz() {
        zzecf zzecfVar = (zzecf) this.zza.get(this.zzf);
        return zzecfVar == null ? "" : zzecfVar.zza();
    }

    public final void zzc(String str, zzdiu zzdiuVar) {
        String strZzQ = zzdiuVar.zzQ();
        String strZzB = zzdiuVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzQ)) {
            strZzQ = strZzB != null ? strZzB : "";
        }
        zzbfw zzbfwVarZzD = zzdiuVar.zzD();
        if (zzbfwVarZzD != null) {
            try {
                string = zzbfwVarZzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfw zzbfwVarZzP = zzdiuVar.zzP();
        Drawable drawable = null;
        if (zzbfwVarZzP != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbfwVarZzP.zzb();
                if (iObjectWrapperZzb != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzecc(strZzQ, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(context);
                HashMap map = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zZzs ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzecn.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws IOException {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzecl
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) throws Throwable {
                zzecn.zzf(zzuVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzh(IObjectWrapper iObjectWrapper) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzeda zzedaVar = (zzeda) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzedaVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzl zzlVarZzb = zzedaVar.zzb();
        this.zzf = zzedaVar.zzc();
        this.zzg = zzedaVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjj)).booleanValue()) {
            zzs(activityZza, zzlVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgkc.zza());
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(activityZza);
        builderZzO.setTitle(zzx(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.zzl(activityZza, zzlVarZzb, dialogInterface, i);
            }
        }).setNegativeButton(zzx(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzm(zzlVarZzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecs
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.zza.zzn(zzlVarZzb, dialogInterface);
            }
        });
        builderZzO.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeda zzedaVar = (zzeda) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzedaVar.zza();
                com.google.android.gms.ads.internal.overlay.zzl zzlVarZzb = zzedaVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    zzt();
                    zzu(activityZza, zzlVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzlVarZzb != null) {
                        zzlVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws IOException {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        String strZzz = zzz();
        com.google.android.gms.ads.internal.zzt.zzf().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strZzz)) {
            builder.h(zzx(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.h(String.format(zzx(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzz));
        }
        builder.k(16, true);
        builder.x.deleteIntent = pendingIntentZzr2;
        builder.g = pendingIntentZzr;
        builder.x.icon = context.getApplicationInfo().icon;
        builder.j = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjk)).intValue();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjm)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str4).openConnection();
                Callback.v(uRLConnectionOpenConnection);
                bitmapDecodeStream = BitmapFactory.decodeStream(Callback.b(uRLConnectionOpenConnection));
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.b = bitmapDecodeStream;
                builder.h = iconCompat;
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                IconCompat iconCompat2 = new IconCompat(1);
                iconCompat2.b = bitmapDecodeStream;
                bigPictureStyle.e = iconCompat2;
                bigPictureStyle.f = null;
                bigPictureStyle.g = true;
                builder.q(bigPictureStyle);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.b());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    public final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzw(this.zzf, "dialog_click", androidx.constraintlayout.core.state.a.r("dialog_action", "confirm"));
        zzs(activity, zzlVar);
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzo(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzw(this.zzf, "rtsdc", androidx.constraintlayout.core.state.a.r("dialog_action", "confirm"));
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzf().zzi(activity));
        zzt();
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzq(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
