package au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve;

import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import com.swrve.sdk.SwrveSDKBase;
import com.swrve.sdk.messaging.SwrveBaseCampaign;
import com.swrve.sdk.messaging.SwrveEmbeddedCampaign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveDataSourceImpl;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/swrve/SwrveDataSource;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SwrveDataSourceImpl implements SwrveDataSource {

    /* renamed from: a, reason: collision with root package name */
    public static final SwrveDataSourceImpl f8433a = new SwrveDataSourceImpl();
    public static final Flow b;
    public static final SharedFlowImpl c;
    public static final SwrveDataSourceImpl$special$$inlined$map$1 d;

    /* JADX WARN: Type inference failed for: r0v5, types: [au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl$special$$inlined$map$1] */
    static {
        Flow flowD = FlowKt.d(new SwrveDataSourceImpl$swrveResourcesRefreshed$1(2, null));
        b = flowD;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 7);
        c = sharedFlowImplB;
        final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new SwrveDataSourceImpl$messages$1(2, null), FlowKt.G(flowD, sharedFlowImplB));
        d = new Flow<List<? extends InboxMessage>>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl$special$$inlined$map$1$2", f = "SwrveDataSource.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r27, kotlin.coroutines.Continuation r28) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 364
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public static ArrayList d() {
        SwrveSDKBase.a();
        ArrayList arrayListZ = SwrveSDKBase.f19075a.z();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListZ) {
            if (obj instanceof SwrveEmbeddedCampaign) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = ((SwrveEmbeddedCampaign) next).o.d;
            Intrinsics.g(str, "getData(...)");
            if (StringsKt.o(str, "\"notificationCentre\"", false)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource
    public final Object a(Continuation continuation) {
        Object objEmit;
        Iterator it = d().iterator();
        boolean z = false;
        while (it.hasNext()) {
            SwrveEmbeddedCampaign swrveEmbeddedCampaign = (SwrveEmbeddedCampaign) it.next();
            SwrveSDKBase.a();
            SwrveSDKBase.f19075a.g(swrveEmbeddedCampaign);
            z = true;
        }
        Unit unit = Unit.f24250a;
        return (z && (objEmit = c.emit(unit, continuation)) == CoroutineSingletons.d) ? objEmit : unit;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource
    public final Object b(String str, Continuation continuation) throws Throwable {
        Object next;
        SwrveSDKBase.a();
        Iterator it = SwrveSDKBase.f19075a.z().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i = ((SwrveBaseCampaign) next).c;
            Integer numI0 = StringsKt.i0(str);
            if (numI0 != null && i == numI0.intValue()) {
                break;
            }
        }
        SwrveBaseCampaign swrveBaseCampaign = (SwrveBaseCampaign) next;
        Unit unit = Unit.f24250a;
        if (swrveBaseCampaign != null) {
            SwrveSDKBase.a();
            SwrveSDKBase.f19075a.g(swrveBaseCampaign);
            Object objEmit = c.emit(unit, continuation);
            if (objEmit == CoroutineSingletons.d) {
                return objEmit;
            }
        }
        return unit;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource
    public final Object c(ArrayList arrayList, Continuation continuation) {
        Object objEmit;
        SwrveSDKBase.a();
        boolean z = false;
        for (SwrveBaseCampaign swrveBaseCampaign : SwrveSDKBase.f19075a.z()) {
            if (arrayList.contains(String.valueOf(swrveBaseCampaign.c))) {
                SwrveSDKBase.a();
                SwrveSDKBase.f19075a.F(swrveBaseCampaign);
                z = true;
            }
        }
        Unit unit = Unit.f24250a;
        return (z && (objEmit = c.emit(unit, continuation)) == CoroutineSingletons.d) ? objEmit : unit;
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSource
    public final SwrveDataSourceImpl$special$$inlined$map$1 getMessages() {
        return d;
    }
}
