package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    final com.google.android.play.integrity.internal.ae f14716a;
    private final com.google.android.play.integrity.internal.s b;
    private final String c;
    private final at d;
    private final k e;

    public aj(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        this.c = context.getPackageName();
        this.b = sVar;
        this.d = atVar;
        this.e = kVar;
        com.google.android.play.integrity.internal.s sVar2 = com.google.android.play.integrity.internal.ai.f14770a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (com.google.android.play.integrity.internal.ai.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    this.f14716a = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", ak.f14717a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                        @Override // com.google.android.play.integrity.internal.z
                        public final Object a(IBinder iBinder) {
                            int i = com.google.android.play.integrity.internal.m.g;
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                            return iInterfaceQueryLocalInterface instanceof com.google.android.play.integrity.internal.n ? (com.google.android.play.integrity.internal.n) iInterfaceQueryLocalInterface : new com.google.android.play.integrity.internal.l(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                        }
                    });
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        sVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", com.google.android.play.integrity.internal.s.c(sVar.f14775a, "Phonesky is not installed.", objArr));
        }
        this.f14716a = null;
    }

    public static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    @VisibleForTesting
    public final Task b(Activity activity, Bundle bundle) {
        if (this.f14716a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14716a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f14716a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f14716a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
