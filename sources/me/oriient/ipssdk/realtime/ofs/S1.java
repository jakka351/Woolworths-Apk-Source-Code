package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingRestServiceImpl;

/* loaded from: classes8.dex */
public final class S1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EventTaggingRestServiceImpl f26005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(EventTaggingRestServiceImpl eventTaggingRestServiceImpl) {
        super(0);
        this.f26005a = eventTaggingRestServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoroutineScopeKt.a(this.f26005a.f26192a.getIo());
    }
}
