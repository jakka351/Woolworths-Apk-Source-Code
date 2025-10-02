package me.oriient.internal.services.uploadingManager;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;

/* renamed from: me.oriient.internal.services.uploadingManager.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1538p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25644a;
    public final /* synthetic */ DataUploaderItem b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Map d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1538p(String str, DataUploaderItem dataUploaderItem, String str2, Map map) {
        super(0);
        this.f25644a = str;
        this.b = dataUploaderItem;
        this.c = str2;
        this.d = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.m(MapsKt.j(new Pair("eventMessage", this.f25644a), new Pair("sessionId", this.b.getSessionId()), new Pair("isLast", String.valueOf(this.b.isLast())), new Pair("indexInSession", String.valueOf(this.b.getMetadata().getIndexInSession())), new Pair("errorText", this.c), new Pair("spaceId", this.b.getMetadata().getSpaceId()), new Pair("sessionType", this.b.getMetadata().getSessionType().getValue()), new Pair("dataType", this.b.getDataType().getStrValue())), this.d);
    }
}
