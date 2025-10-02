package me.oriient.positioningengine.ondevice.initialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import me.oriient.internal.infra.utils.core.Logger;

/* loaded from: classes8.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f26435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f26435a = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Regex regex = d.c;
            this.f26435a.getClass();
            MatchResult matchResultB = regex.b(0, "8.1.0-onDevice");
            return matchResultB != null ? matchResultB.getValue() : "";
        } catch (IndexOutOfBoundsException e) {
            Logger logger = (Logger) this.f26435a.b.getD();
            this.f26435a.getClass();
            logger.e("EngineVersionProvider", "Failed to extract short version from 8.1.0-onDevice", e);
            return "";
        }
    }
}
