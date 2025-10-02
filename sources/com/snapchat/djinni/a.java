package com.snapchat.djinni;

import com.snapchat.djinni.Outcome;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Outcome.ResultHandler, Outcome.ErrorHandler {
    public final /* synthetic */ int d;
    public final /* synthetic */ Outcome e;

    public /* synthetic */ a(Outcome outcome, int i) {
        this.d = i;
        this.e = outcome;
    }

    @Override // com.snapchat.djinni.Outcome.ResultHandler, com.snapchat.djinni.Outcome.ErrorHandler
    public final Object apply() {
        switch (this.d) {
            case 0:
                Outcome outcome = this.e;
                outcome.getClass();
                outcome.a(new com.google.common.net.a(18), new com.google.common.net.a(17));
                throw null;
            default:
                this.e.a(new com.google.common.net.a(16), new com.google.common.net.a(17));
                throw null;
        }
    }
}
