package me.oriient.internal.services.dataManager.mapGrid;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.ParsingError;

/* loaded from: classes7.dex */
public final class J extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1324w f25197a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C1324w c1324w, String str, int i, int i2, String str2) {
        super(1);
        this.f25197a = c1324w;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws ParsingError {
        List listG0;
        List listQ;
        byte[] body = (byte[]) obj;
        Intrinsics.h(body, "body");
        if (body.length < 28) {
            throw new ParsingError("body is too short");
        }
        int length = body.length;
        if (28 >= length) {
            listG0 = ArraysKt.g0(body);
        } else {
            ArrayList arrayList = new ArrayList(28);
            for (int i = length - 28; i < length; i++) {
                arrayList.add(Byte.valueOf(body[i]));
            }
            listG0 = arrayList;
        }
        byte[] bArrB0 = CollectionsKt.B0(CollectionsKt.x0(12, listG0));
        byte[] bArrB02 = CollectionsKt.B0(CollectionsKt.w0(listG0, 16));
        int length2 = body.length - 28;
        if (length2 < 0) {
            length2 = 0;
        }
        if (length2 < 0) {
            throw new IllegalArgumentException(YU.a.e(length2, "Requested element count ", " is less than zero.").toString());
        }
        if (length2 == 0) {
            listQ = EmptyList.d;
        } else if (length2 >= body.length) {
            listQ = ArraysKt.g0(body);
        } else if (length2 == 1) {
            listQ = CollectionsKt.Q(Byte.valueOf(body[0]));
        } else {
            ArrayList arrayList2 = new ArrayList(length2);
            int i2 = 0;
            for (byte b : body) {
                arrayList2.add(Byte.valueOf(b));
                i2++;
                if (i2 == length2) {
                    break;
                }
            }
            listQ = arrayList2;
        }
        byte[] bArrB03 = CollectionsKt.B0(listQ);
        C1324w c1324w = this.f25197a;
        return new MapGridRecord(c1324w.f25227a, c1324w.b, c1324w.c, bArrB03, bArrB0, bArrB02, this.b, this.c, c1324w.d, this.d, this.e);
    }
}
