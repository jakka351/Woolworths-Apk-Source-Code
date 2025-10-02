package au.com.woolworths.feature.shop.login.guest;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ GuestLoginInteractorImpl e;

    public /* synthetic */ a(GuestLoginInteractorImpl guestLoginInteractorImpl, int i) {
        this.d = i;
        this.e = guestLoginInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Boolean it = (Boolean) obj;
                Intrinsics.h(it, "it");
                return this.e.c();
            default:
                Timber.f27013a.n("Could not set server side pick up store and shopping mode", (Throwable) obj, new Object[0]);
                SharedPreferences.Editor editorEdit = this.e.h.b.edit();
                editorEdit.remove("pick_up_location_info");
                editorEdit.apply();
                return Unit.f24250a;
        }
    }
}
