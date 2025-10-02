package au.com.woolworths.rewards.base;

import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ a(boolean z, int i) {
        this.d = i;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LocalScrollStatus update = (LocalScrollStatus) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(update, "$this$update");
                update.f9349a = this.e;
                break;
            default:
                Intrinsics.h(update, "$this$update");
                Intrinsics.h(update.b, "<this>");
                RewardsPageScrollManager.Status status = this.e ? new RewardsPageScrollManager.Status(RewardsPageScrollManager.Kind.f, 0, new d(1)) : RewardsPageScrollManager.c;
                Intrinsics.h(status, "<set-?>");
                update.b = status;
                break;
        }
        return Unit.f24250a;
    }
}
