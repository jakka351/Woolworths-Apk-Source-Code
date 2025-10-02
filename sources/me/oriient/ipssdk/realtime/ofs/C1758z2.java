package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.services.rest.IRegionsTriggersListener;
import me.oriient.ipssdk.realtime.services.rest.MapsRestServiceImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.z2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1758z2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26184a;
    public final /* synthetic */ MapsRestServiceImpl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ User e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ IRegionsTriggersListener i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1758z2(MapsRestServiceImpl mapsRestServiceImpl, String str, String str2, User user, String str3, String str4, int i, IRegionsTriggersListener iRegionsTriggersListener, Continuation continuation) {
        super(2, continuation);
        this.b = mapsRestServiceImpl;
        this.c = str;
        this.d = str2;
        this.e = user;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = iRegionsTriggersListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1758z2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1758z2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.C1758z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
