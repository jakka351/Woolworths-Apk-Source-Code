package au.com.woolworths.foundation.shop.instore.presence.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InstorePresencePromptClickHandler e;
    public final /* synthetic */ InstorePresencePrompt f;

    public /* synthetic */ a(InstorePresencePromptClickHandler instorePresencePromptClickHandler, InstorePresencePrompt instorePresencePrompt, int i) {
        this.d = i;
        this.e = instorePresencePromptClickHandler;
        this.f = instorePresencePrompt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.p0(this.f);
                break;
            case 1:
                this.e.Q(this.f);
                break;
            case 2:
                this.e.X2(this.f);
                break;
            case 3:
                this.e.h6(this.f);
                break;
            default:
                this.e.t5(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
