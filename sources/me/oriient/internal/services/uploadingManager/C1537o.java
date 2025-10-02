package me.oriient.internal.services.uploadingManager;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;

/* renamed from: me.oriient.internal.services.uploadingManager.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1537o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25643a;
    public final /* synthetic */ DataUploaderItem b;
    public final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537o(String str, DataUploaderItem dataUploaderItem, Map map) {
        super(0);
        this.f25643a = str;
        this.b = dataUploaderItem;
        this.c = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.m(MapsKt.j(new Pair("eventMessage", this.f25643a), new Pair("sessionId", this.b.getSessionId()), new Pair("isLast", String.valueOf(this.b.isLast())), new Pair("indexInSession", String.valueOf(this.b.getMetadata().getIndexInSession())), new Pair("spaceId", this.b.getMetadata().getSpaceId()), new Pair("sessionType", this.b.getMetadata().getSessionType().getValue()), new Pair("dataType", this.b.getDataType().getStrValue())), this.c);
    }
}
