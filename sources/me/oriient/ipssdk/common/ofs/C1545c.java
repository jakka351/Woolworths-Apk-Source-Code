package me.oriient.ipssdk.common.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.common.services.rest.responses.BuildingsResponse;
import me.oriient.ipssdk.common.services.rest.services.BuildingsRestServiceImpl;
import me.oriient.ipssdk.common.utils.IBuildingsSearchListener;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.common.utils.runtimedata.UserSessionId;

/* renamed from: me.oriient.ipssdk.common.ofs.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1545c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25742a;
    public final /* synthetic */ BuildingsRestServiceImpl b;
    public final /* synthetic */ User c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ IBuildingsSearchListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1545c(BuildingsRestServiceImpl buildingsRestServiceImpl, User user, String str, String str2, IBuildingsSearchListener iBuildingsSearchListener, Continuation continuation) {
        super(2, continuation);
        this.b = buildingsRestServiceImpl;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = iBuildingsSearchListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1545c(this.b, this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1545c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25742a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                BuildingsRestServiceImpl buildingsRestServiceImpl = this.b;
                User user = this.c;
                String strM452constructorimpl = UserSessionId.m452constructorimpl(this.d);
                String str = this.e;
                this.f25742a = 1;
                obj = BuildingsRestServiceImpl.m436access$getAllBuildingsSyncR0umqfA(buildingsRestServiceImpl, user, strM452constructorimpl, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                BuildingsRestServiceImpl buildingsRestServiceImpl2 = this.b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((BuildingsResponse) it.next()).toBuildingSearchResultV4());
                    } catch (Throwable th) {
                        BuildingsRestServiceImpl.access$getLogger(buildingsRestServiceImpl2).e("BuildingsRestService", "searchBuildingByNameJava: failed to parse BuildingsSearchResultV4: " + th.getMessage());
                    }
                }
            }
            this.f.onBuildingsSearchReceived(arrayList);
        } catch (Throwable th2) {
            BuildingsRestServiceImpl.access$getLogger(this.b).e("BuildingsRestService", "searchBuildingByName: " + th2.getMessage());
            this.f.onError(new Error("failed to get searchBuildingByName: " + th2.getMessage(), 0, 1));
        }
        return Unit.f24250a;
    }
}
