package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagType;

/* renamed from: me.oriient.ipssdk.realtime.ofs.v3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1739v3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26162a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ EventTagType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739v3(String str, long j, long j2, EventTagType eventTagType) {
        super(0);
        this.f26162a = str;
        this.b = j;
        this.c = j2;
        this.d = eventTagType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("eventTag", this.f26162a), new Pair("ts", Long.valueOf(this.b)), new Pair("eventTagsCachingEnabled", Boolean.valueOf(Positioning.access$getConfigManager(Positioning.INSTANCE).getRealTimeConfig().getMisc().getEventTagsCachingEnabled())), new Pair("delta", Long.valueOf(this.c)), new Pair("eventType", this.d.getValue()));
    }
}
