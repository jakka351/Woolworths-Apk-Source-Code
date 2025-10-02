package com.tealium.core.network;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.tealium.core.Logger;
import com.tealium.core.TealiumConfig;
import com.tealium.core.network.HttpClient;
import com.tealium.core.network.ResponseStatus;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/network/ResourceRetriever;", "", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ResourceRetriever {
    public static final a f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f19161a;
    public final HttpClient b;
    public int c;
    public volatile Long d;
    public boolean e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/ResourceRetriever$a;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$Companion", f = "ResourceRetriever.kt", l = {165, 176}, m = "retry")
        /* renamed from: com.tealium.core.network.ResourceRetriever$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        final class C0389a<T> extends ContinuationImpl {
            public /* synthetic */ Object p;
            public int q;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.p = obj;
                this.q |= Integer.MIN_VALUE;
                throw null;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$Companion$retry$2", f = "ResourceRetriever.kt", l = {170}, m = "invokeSuspend")
        /* loaded from: classes6.dex */
        final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
            public int p;
            public final /* synthetic */ int q;
            public final /* synthetic */ Function2 r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i, Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.q = i;
                this.r = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.q, this.r, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return obj;
                }
                ResultKt.b(obj);
                Logger.Companion companion = Logger.f19124a;
                StringBuilder sb = new StringBuilder("Fetching resource; attempt number ");
                int i2 = this.q;
                sb.append(i2);
                sb.append(" of 0.");
                companion.b("Tealium-1.6.0", sb.toString());
                Integer num = new Integer(i2);
                this.p = 1;
                Object objInvoke = this.r.invoke(num, this);
                return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
            }
        }

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$Companion", f = "ResourceRetriever.kt", l = {200, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER}, m = "retryWithBackoff$tealiumlibrary_release")
        /* loaded from: classes6.dex */
        final class c<T> extends ContinuationImpl {
            public int p;
            public int q;
            public long r;
            public long s;
            public Function1 t;
            public Function2 u;
            public /* synthetic */ Object v;
            public int x;

            public c(ContinuationImpl continuationImpl) {
                super(continuationImpl);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.v = obj;
                this.x |= Integer.MIN_VALUE;
                return a.this.a(0, 0L, 0L, null, null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$Companion$retryWithBackoff$2", f = "ResourceRetriever.kt", l = {208}, m = "invokeSuspend")
        /* loaded from: classes6.dex */
        final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
            public int p;
            public final /* synthetic */ int q;
            public final /* synthetic */ int r;
            public final /* synthetic */ Function2 s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i, int i2, Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.q = i;
                this.r = i2;
                this.s = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new d(this.q, this.r, this.s, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return obj;
                }
                ResultKt.b(obj);
                Logger.Companion companion = Logger.f19124a;
                int i2 = this.q;
                companion.b("Tealium-1.6.0", androidx.camera.core.impl.b.j(i2, this.r, "Fetching resource; attempt number ", " of ", "."));
                Integer num = new Integer(i2);
                this.p = 1;
                Object objInvoke = this.s.invoke(num, this);
                return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
        
            if (kotlinx.coroutines.DelayKt.b(r12 * r8, r13) == r3) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
        
            if (r0 == r3) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
        
            return r3;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c5 -> B:13:0x0040). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(int r19, long r20, long r22, kotlin.jvm.functions.Function1 r24, kotlin.jvm.functions.Function2 r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.network.ResourceRetriever.a.a(int, long, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetch$2", f = "ResourceRetriever.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
        final class a extends Lambda implements Function1<String, Boolean> {
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((String) obj) == null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetch$2$1$2", f = "ResourceRetriever.kt", l = {68}, m = "invokeSuspend")
        /* renamed from: com.tealium.core.network.ResourceRetriever$b$b, reason: collision with other inner class name */
        final class C0390b extends SuspendLambda implements Function2<Integer, Continuation<? super String>, Object> {
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj).intValue();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetchIfModified$2", f = "ResourceRetriever.kt", l = {130}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetchIfModified$2$1", f = "ResourceRetriever.kt", l = {135, 140}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                CoroutineScopeKt.d(null);
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetchResource$2", f = "ResourceRetriever.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetchResource$2$1", f = "ResourceRetriever.kt", l = {108, 112}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/tealium/core/network/ResourceEntity;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetchResourceEntity$2", f = "ResourceRetriever.kt", l = {118}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResourceEntity>, Object> {
        public int p;
        public final /* synthetic */ String r;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/tealium/core/network/ResourceEntity;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetchResourceEntity$2$1", f = "ResourceRetriever.kt", l = {123}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResourceEntity>, Object> {
            public int p;
            public /* synthetic */ Object q;
            public final /* synthetic */ ResourceRetriever r;
            public final /* synthetic */ String s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ResourceRetriever resourceRetriever, String str, Continuation continuation) {
                super(2, continuation);
                this.r = resourceRetriever;
                this.s = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.r, this.s, continuation);
                aVar.q = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    if (!CoroutineScopeKt.d((CoroutineScope) this.q)) {
                        return new ResourceEntity(null, null, ResponseStatus.Cancelled.f19162a);
                    }
                    ResourceRetriever resourceRetriever = this.r;
                    HttpClient httpClient = resourceRetriever.b;
                    String str = resourceRetriever.f19161a;
                    this.p = 1;
                    obj = CoroutineScopeKt.c(new HttpClient.b(str, httpClient, this.s, null), this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                ResourceEntity resourceEntity = (ResourceEntity) obj;
                Logger.f19124a.b("Tealium-1.6.0", "Fetched resource with JSON: " + (resourceEntity != null ? resourceEntity.f19160a : null) + ".");
                return resourceEntity;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation continuation) {
            super(2, continuation);
            this.r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ResourceRetriever.this.new e(this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            a aVar = new a(ResourceRetriever.this, this.r, null);
            this.p = 1;
            Object objF = BuildersKt.f(defaultScheduler, aVar, this);
            return objF == coroutineSingletons ? coroutineSingletons : objF;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/tealium/core/network/ResourceEntity;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetchWithEtag$2", f = "ResourceRetriever.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResourceEntity>, Object> {
        public ResourceRetriever p;
        public int q;
        public final /* synthetic */ String s;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/tealium/core/network/ResourceEntity;", "entity", "", "a", "(Lcom/tealium/core/network/ResourceEntity;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
        final class a extends Lambda implements Function1<ResourceEntity, Boolean> {
            public static final a h = new a(1);

            /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r5) {
                /*
                    r4 = this;
                    com.tealium.core.network.ResourceEntity r5 = (com.tealium.core.network.ResourceEntity) r5
                    if (r5 == 0) goto L7
                    com.tealium.core.network.ResponseStatus r5 = r5.c
                    goto L8
                L7:
                    r5 = 0
                L8:
                    r0 = 1
                    if (r5 != 0) goto Lc
                    goto L46
                Lc:
                    boolean r1 = r5 instanceof com.tealium.core.network.ResponseStatus.Success
                    if (r1 == 0) goto L12
                    r1 = r0
                    goto L14
                L12:
                    boolean r1 = r5 instanceof com.tealium.core.network.ResponseStatus.Cancelled
                L14:
                    r2 = 0
                    if (r1 == 0) goto L18
                    goto L45
                L18:
                    boolean r1 = r5 instanceof com.tealium.core.network.ResponseStatus.Non200Response
                    if (r1 == 0) goto L40
                    com.tealium.core.network.ResponseStatus$Non200Response r5 = (com.tealium.core.network.ResponseStatus.Non200Response) r5
                    int r1 = r5.getF19163a()
                    r3 = 408(0x198, float:5.72E-43)
                    if (r1 == r3) goto L46
                    int r1 = r5.getF19163a()
                    r3 = 429(0x1ad, float:6.01E-43)
                    if (r1 == r3) goto L46
                    int r5 = r5.getF19163a()
                    r1 = 500(0x1f4, float:7.0E-43)
                    if (r1 > r5) goto L3c
                    r1 = 600(0x258, float:8.41E-43)
                    if (r5 >= r1) goto L3c
                    r5 = r0
                    goto L3d
                L3c:
                    r5 = r2
                L3d:
                    if (r5 == 0) goto L45
                    goto L46
                L40:
                    boolean r5 = r5 instanceof com.tealium.core.network.ResponseStatus.UnknownError
                    if (r5 == 0) goto L45
                    goto L46
                L45:
                    r0 = r2
                L46:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.network.ResourceRetriever.f.a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lcom/tealium/core/network/ResourceEntity;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.ResourceRetriever$fetchWithEtag$2$1$2", f = "ResourceRetriever.kt", l = {79}, m = "invokeSuspend")
        final class b extends SuspendLambda implements Function2<Integer, Continuation<? super ResourceEntity>, Object> {
            public int p;
            public final /* synthetic */ ResourceRetriever q;
            public final /* synthetic */ String r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ResourceRetriever resourceRetriever, String str, Continuation continuation) {
                super(2, continuation);
                this.q = resourceRetriever;
                this.r = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.q, this.r, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((b) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return obj;
                }
                ResultKt.b(obj);
                this.p = 1;
                Object objC = CoroutineScopeKt.c(this.q.new e(this.r, null), this);
                return objC == coroutineSingletons ? coroutineSingletons : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation continuation) {
            super(2, continuation);
            this.s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ResourceRetriever.this.new f(this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        
            if ((java.lang.System.currentTimeMillis() - r3.longValue()) > (r11.c * com.medallia.digital.mobilesdk.l8.b.b)) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                r16 = this;
                r8 = r16
                java.lang.String r0 = "Fetching resource: "
                kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r8.q
                r10 = 0
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                com.tealium.core.network.ResourceRetriever r1 = r8.p
                kotlin.ResultKt.b(r17)     // Catch: java.lang.Throwable -> L17
                r0 = r17
                goto L94
            L17:
                r0 = move-exception
                goto La4
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                kotlin.ResultKt.b(r17)
                com.tealium.core.network.ResourceRetriever r11 = com.tealium.core.network.ResourceRetriever.this
                java.lang.String r1 = r8.s
                boolean r3 = r11.e
                r4 = 0
                java.lang.String r5 = "Tealium-1.6.0"
                if (r3 == 0) goto L31
                goto L4f
            L31:
                java.lang.Long r3 = r11.d
                if (r3 == 0) goto L65
                int r6 = r11.c
                if (r6 != 0) goto L3a
                goto L65
            L3a:
                long r6 = r3.longValue()
                long r12 = java.lang.System.currentTimeMillis()
                long r12 = r12 - r6
                int r3 = r11.c
                long r6 = (long) r3
                r14 = 60000(0xea60, double:2.9644E-319)
                long r6 = r6 * r14
                int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
                if (r3 <= 0) goto L4f
                goto L65
            L4f:
                com.tealium.core.Logger$Companion r0 = com.tealium.core.Logger.f19124a
                java.lang.String r1 = r11.f19161a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Resource timeout has not expired. Will not fetch: "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.b(r5, r1)
                return r4
            L65:
                r11.e = r2     // Catch: java.lang.Throwable -> La6
                com.tealium.core.Logger$Companion r3 = com.tealium.core.Logger.f19124a     // Catch: java.lang.Throwable -> La6
                java.lang.String r6 = r11.f19161a     // Catch: java.lang.Throwable -> La6
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
                r7.<init>(r0)     // Catch: java.lang.Throwable -> La6
                r7.append(r6)     // Catch: java.lang.Throwable -> La6
                java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> La6
                r3.b(r5, r0)     // Catch: java.lang.Throwable -> La6
                com.tealium.core.network.ResourceRetriever$f$a r6 = com.tealium.core.network.ResourceRetriever.f.a.h     // Catch: java.lang.Throwable -> La6
                com.tealium.core.network.ResourceRetriever$f$b r7 = new com.tealium.core.network.ResourceRetriever$f$b     // Catch: java.lang.Throwable -> La6
                r7.<init>(r11, r1, r4)     // Catch: java.lang.Throwable -> La6
                r8.p = r11     // Catch: java.lang.Throwable -> La6
                r8.q = r2     // Catch: java.lang.Throwable -> La6
                com.tealium.core.network.ResourceRetriever$a r0 = com.tealium.core.network.ResourceRetriever.f     // Catch: java.lang.Throwable -> La6
                r2 = 500(0x1f4, double:2.47E-321)
                r4 = 1000(0x3e8, double:4.94E-321)
                r1 = 5
                java.lang.Object r0 = r0.a(r1, r2, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> La6
                if (r0 != r9) goto L93
                return r9
            L93:
                r1 = r11
            L94:
                com.tealium.core.network.ResourceEntity r0 = (com.tealium.core.network.ResourceEntity) r0     // Catch: java.lang.Throwable -> L17
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.Long r4 = new java.lang.Long
                r4.<init>(r2)
                r1.d = r4
                r1.e = r10
                return r0
            La4:
                r11 = r1
                goto La7
            La6:
                r0 = move-exception
            La7:
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.Long r3 = new java.lang.Long
                r3.<init>(r1)
                r11.d = r3
                r11.e = r10
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.network.ResourceRetriever.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ResourceRetriever(TealiumConfig tealiumConfig, String resourceUrlString, HttpClient httpClient) {
        Intrinsics.h(resourceUrlString, "resourceUrlString");
        this.f19161a = resourceUrlString;
        this.b = httpClient;
        this.c = 60;
        new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT).setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    public final Object a(String str, SuspendLambda suspendLambda) {
        return CoroutineScopeKt.c(new f(str, null), suspendLambda);
    }
}
