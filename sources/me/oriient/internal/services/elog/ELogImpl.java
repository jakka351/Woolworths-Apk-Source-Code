package me.oriient.internal.services.elog;

import androidx.annotation.Keep;
import io.jsonwebtoken.JwtParser;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.geofence.GeneralGeofenceStatus;
import me.oriient.internal.services.geofence.GeneralGeofenceStatusProvider;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.internal.services.remoteLog.RemoteLog;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 {2\u00020\u0001:\u0002|}BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JS\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001e\b\u0002\u0010\u001e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c\u0018\u00010\u001b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#JK\u0010$\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020!2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b)\u0010*JC\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u00010\u001f2\u0006\u00102\u001a\u00020\u0018H\u0002¢\u0006\u0004\b3\u00104JA\u0010<\u001a\u00020!2\b\u00102\u001a\u0004\u0018\u00010\u00182\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002052\u0006\u0010;\u001a\u00020&H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b>\u0010?J7\u0010>\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b>\u0010@J;\u0010>\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\b>\u0010AJ\u001f\u0010B\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\bB\u0010?J7\u0010B\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\bB\u0010@J;\u0010B\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\bB\u0010AJ\u001f\u0010C\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\bC\u0010?J7\u0010C\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\bC\u0010@J;\u0010C\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\bC\u0010AJ\u001f\u0010D\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\bD\u0010?J7\u0010D\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\bD\u0010@J;\u0010D\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\bD\u0010AJ\u001f\u0010E\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\bE\u0010?J7\u0010E\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\bE\u0010@J;\u0010E\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\bE\u0010AJ\u001f\u0010F\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\bF\u0010?J7\u0010F\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\bF\u0010@J;\u0010F\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\bF\u0010AJ\u001f\u0010G\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\bG\u0010?J7\u0010G\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\bG\u0010@J;\u0010G\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\bG\u0010AJ'\u0010G\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bG\u0010JJ\u001f\u0010K\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\bK\u0010?J7\u0010K\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\bK\u0010@J;\u0010K\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\bK\u0010AJ'\u0010L\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bL\u0010MJ?\u0010L\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bL\u0010NJC\u0010L\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bL\u0010OJ\u0018\u0010R\u001a\u00020!2\u0006\u0010Q\u001a\u00020PH\u0096@¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010WR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010YR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010[R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\\R\"\u0010]\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010oR(\u0010r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001d0\u001c0q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010tR\u0016\u0010;\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010^R\u001b\u0010z\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y¨\u0006~"}, d2 = {"Lme/oriient/internal/services/elog/ELogImpl;", "Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/infra/utils/core/OsData;", "osData", "Lme/oriient/internal/infra/utils/core/BuildData;", "buildData", "Lme/oriient/internal/infra/utils/core/DeviceIdProvider;", "deviceIdProvider", "Lme/oriient/internal/services/elog/ELogRemoteLogFactory;", "remoteLogFactory", "Lme/oriient/internal/services/elog/ELogCustomParamsAppender;", "customParamsAppender", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatusProvider;", "generalGeofenceStatusProvider", "Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataProvider;", "runtimeDataProvider", "Lme/oriient/internal/services/elog/ELog$Type;", "logType", "<init>", "(Lme/oriient/internal/infra/utils/core/OsData;Lme/oriient/internal/infra/utils/core/BuildData;Lme/oriient/internal/infra/utils/core/DeviceIdProvider;Lme/oriient/internal/services/elog/ELogRemoteLogFactory;Lme/oriient/internal/services/elog/ELogCustomParamsAppender;Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;Lme/oriient/internal/services/geofence/GeneralGeofenceStatusProvider;Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataProvider;Lme/oriient/internal/services/elog/ELog$Type;)V", "Lme/oriient/internal/services/elog/ELog$Level;", "level", "", "tag", "message", "Lkotlin/Function0;", "", "", "metadata", "Lme/oriient/internal/services/remoteLog/RemoteLog;", "log", "", "sendLog", "(Lme/oriient/internal/services/elog/ELog$Level;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lme/oriient/internal/services/remoteLog/RemoteLog;)V", "sendToServer", "(Lme/oriient/internal/services/elog/ELog$Level;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lme/oriient/internal/services/remoteLog/RemoteLog;)V", "", "shouldNotELog", "(Lme/oriient/internal/services/elog/ELog$Level;)Z", "savePendingMessage", "(Ljava/util/Map;)V", "buildLogMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "logCaller", "(Ljava/lang/String;)V", "prepareMessage", "(Ljava/lang/String;)Ljava/lang/String;", "currentLog", "url", "getOrCreateLog", "(Lme/oriient/internal/services/remoteLog/RemoteLog;Ljava/lang/String;)Lme/oriient/internal/services/remoteLog/RemoteLog;", "", com.salesforce.marketingcloud.config.a.k, "retries", "", "sendingIntervalSeconds", "queueSize", "considerGeofenceAlwaysInside", "configure", "(Ljava/lang/String;IIJIZ)V", "io", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "v", "d", "i", "api", "w", "e", "", "tr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "c", "immediate", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/elog/ELog$Level;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lme/oriient/internal/services/elog/ELog$Level;)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lme/oriient/internal/services/elog/ELog$Level;)V", "", "exceptLastMinutes", "clearAllLogs", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/infra/utils/core/OsData;", "Lme/oriient/internal/infra/utils/core/BuildData;", "Lme/oriient/internal/infra/utils/core/DeviceIdProvider;", "Lme/oriient/internal/services/elog/ELogRemoteLogFactory;", "Lme/oriient/internal/services/elog/ELogCustomParamsAppender;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatusProvider;", "Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataProvider;", "Lme/oriient/internal/services/elog/ELog$Type;", "enableLogging", "Z", "getEnableLogging", "()Z", "setEnableLogging", "(Z)V", "Lme/oriient/internal/services/elog/ELog$Level;", "getLevel", "()Lme/oriient/internal/services/elog/ELog$Level;", "setLevel", "(Lme/oriient/internal/services/elog/ELog$Level;)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/text/SimpleDateFormat;", "formatter", "Ljava/text/SimpleDateFormat;", "remoteLog", "Lme/oriient/internal/services/remoteLog/RemoteLog;", "immediateRemoteLog", "Ljava/util/Queue;", "pendingMessages", "Ljava/util/Queue;", "I", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Companion", "me/oriient/internal/services/elog/a", "a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ELogImpl implements ELog {

    @NotNull
    public static final String API_TAG_PREFIX = "IPSSDK>";

    @NotNull
    public static final me.oriient.internal.services.elog.a Companion = new me.oriient.internal.services.elog.a();

    @NotNull
    public static final String MESSAGES_PREFIX = "X>";

    @NotNull
    public static final String TAG = "ELog";

    @NotNull
    private final BuildData buildData;
    private boolean considerGeofenceAlwaysInside;

    @NotNull
    private final CoroutineContextProvider coroutineContextProvider;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final ELogCustomParamsAppender customParamsAppender;

    @NotNull
    private final DeviceIdProvider deviceIdProvider;
    private boolean enableLogging;

    @NotNull
    private final SimpleDateFormat formatter;

    @NotNull
    private final GeneralGeofenceStatusProvider generalGeofenceStatusProvider;

    @Nullable
    private RemoteLog immediateRemoteLog;

    @NotNull
    private ELog.Level level;

    @NotNull
    private final ELog.Type logType;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final OsData osData;

    @NotNull
    private Queue<Map<String, Object>> pendingMessages;
    private int queueSize;

    @Nullable
    private RemoteLog remoteLog;

    @NotNull
    private final ELogRemoteLogFactory remoteLogFactory;

    @NotNull
    private final RuntimeDataProvider runtimeDataProvider;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @NotNull
        private final String value;
        public static final a DEVICE_ID = new a("DEVICE_ID", 0, "deviceId");
        public static final a TIME = new a("TIME", 1, "time");
        public static final a TIME_STR = new a("TIME_STR", 2, "timeStr");
        public static final a LEVEL = new a("LEVEL", 3, "level");
        public static final a CLIENT_LOG_LEVEL = new a("CLIENT_LOG_LEVEL", 4, "clientLogLevel");
        public static final a LOG_TYPE = new a("LOG_TYPE", 5, "logType");
        public static final a TAG = new a("TAG", 6, "tag");
        public static final a MESSAGE = new a("MESSAGE", 7, "message");
        public static final a SDK_TYPE = new a("SDK_TYPE", 8, "sdkType");
        public static final a SDK_VERSION_NAME = new a("SDK_VERSION_NAME", 9, "sdkVersionName");
        public static final a SDK_VERSION_CODE = new a("SDK_VERSION_CODE", 10, "sdkVersionCode");
        public static final a OS_VERSION = new a("OS_VERSION", 11, "systemVersion");
        public static final a OS_TYPE = new a("OS_TYPE", 12, "osType");
        public static final a APP_VERSION = new a("APP_VERSION", 13, "appVersionName");
        public static final a APP_VERSION_CODE = new a("APP_VERSION_CODE", 14, "appVersionCode");
        public static final a APP_BUNDLE_ID = new a("APP_BUNDLE_ID", 15, "appBundleId");
        public static final a DEVICE_MODEL = new a("DEVICE_MODEL", 16, "deviceModel");
        public static final a NETWORK = new a("NETWORK", 17, "network");
        public static final a GEOFENCE_STATUS = new a("GEOFENCE_STATUS", 18, "geofenceStatus");
        public static final a CLOSEST_BUILDING_ID = new a("CLOSEST_BUILDING_ID", 19, "closestBuildingId");
        public static final a IS_IN_SILENT_MODE = new a("IS_IN_SILENT_MODE", 20, "isInSilentMode");

        private static final /* synthetic */ a[] $values() {
            return new a[]{DEVICE_ID, TIME, TIME_STR, LEVEL, CLIENT_LOG_LEVEL, LOG_TYPE, TAG, MESSAGE, SDK_TYPE, SDK_VERSION_NAME, SDK_VERSION_CODE, OS_VERSION, OS_TYPE, APP_VERSION, APP_VERSION_CODE, APP_BUNDLE_ID, DEVICE_MODEL, NETWORK, GEOFENCE_STATUS, CLOSEST_BUILDING_ID, IS_IN_SILENT_MODE};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = EnumEntriesKt.a(aVarArr$values);
        }

        private a(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    public ELogImpl(@NotNull OsData osData, @NotNull BuildData buildData, @NotNull DeviceIdProvider deviceIdProvider, @NotNull ELogRemoteLogFactory remoteLogFactory, @NotNull ELogCustomParamsAppender customParamsAppender, @NotNull CoroutineContextProvider coroutineContextProvider, @NotNull GeneralGeofenceStatusProvider generalGeofenceStatusProvider, @NotNull RuntimeDataProvider runtimeDataProvider, @NotNull ELog.Type logType) {
        Intrinsics.h(osData, "osData");
        Intrinsics.h(buildData, "buildData");
        Intrinsics.h(deviceIdProvider, "deviceIdProvider");
        Intrinsics.h(remoteLogFactory, "remoteLogFactory");
        Intrinsics.h(customParamsAppender, "customParamsAppender");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.h(generalGeofenceStatusProvider, "generalGeofenceStatusProvider");
        Intrinsics.h(runtimeDataProvider, "runtimeDataProvider");
        Intrinsics.h(logType, "logType");
        this.osData = osData;
        this.buildData = buildData;
        this.deviceIdProvider = deviceIdProvider;
        this.remoteLogFactory = remoteLogFactory;
        this.customParamsAppender = customParamsAppender;
        this.coroutineContextProvider = coroutineContextProvider;
        this.generalGeofenceStatusProvider = generalGeofenceStatusProvider;
        this.runtimeDataProvider = runtimeDataProvider;
        this.logType = logType;
        this.enableLogging = true;
        this.level = ELog.Level.NONE;
        this.coroutineScope = CoroutineScopeKt.a(coroutineContextProvider.newSingleThreadCoroutineContext());
        this.formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSSZ", Locale.US);
        this.pendingMessages = new ConcurrentLinkedQueue();
        this.queueSize = 2000;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> buildLogMessage(String tag, String message, Map<String, ? extends Object> metadata) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        linkedHashMap.put(a.TIME.getValue(), String.valueOf(jCurrentTimeMillis));
        String value = a.TIME_STR.getValue();
        String str = this.formatter.format(new Date(jCurrentTimeMillis));
        Intrinsics.g(str, "format(...)");
        linkedHashMap.put(value, str);
        linkedHashMap.put(a.LEVEL.getValue(), String.valueOf(getLevel().getValue()));
        linkedHashMap.put(a.CLIENT_LOG_LEVEL.getValue(), String.valueOf(getLevel().getValue()));
        linkedHashMap.put(a.LOG_TYPE.getValue(), this.logType.getValue());
        linkedHashMap.put(a.TAG.getValue(), tag);
        linkedHashMap.put(a.MESSAGE.getValue(), prepareMessage(message));
        linkedHashMap.put(a.SDK_VERSION_NAME.getValue(), this.buildData.getVersionName());
        linkedHashMap.put(a.SDK_VERSION_CODE.getValue(), String.valueOf(this.buildData.getVersionCode()));
        linkedHashMap.put(a.OS_TYPE.getValue(), this.osData.getOsType());
        linkedHashMap.put(a.OS_VERSION.getValue(), this.osData.getOsVersion());
        linkedHashMap.put(a.NETWORK.getValue(), this.osData.getConnectionType());
        linkedHashMap.put(a.APP_VERSION.getValue(), this.buildData.getAppVersionName());
        linkedHashMap.put(a.APP_VERSION_CODE.getValue(), String.valueOf(this.buildData.getAppVersionCode()));
        linkedHashMap.put(a.APP_BUNDLE_ID.getValue(), this.buildData.getBundleId());
        linkedHashMap.put(a.IS_IN_SILENT_MODE.getValue(), Boolean.valueOf(this.runtimeDataProvider.isInSilentMode()));
        boolean z = !this.runtimeDataProvider.isInSilentMode() && (this.considerGeofenceAlwaysInside || ((GeneralGeofenceStatus) this.generalGeofenceStatusProvider.getCurrentStatus().getValue()).isConsideredInside());
        if (z) {
            linkedHashMap.put(a.DEVICE_ID.getValue(), this.deviceIdProvider.getDeviceId());
            linkedHashMap.put(a.DEVICE_MODEL.getValue(), this.osData.getDeviceDescription());
        }
        linkedHashMap.put(a.GEOFENCE_STATUS.getValue(), ((GeneralGeofenceStatus) this.generalGeofenceStatusProvider.getCurrentStatus().getValue()).getName());
        GeofenceBuilding closestBuilding = ((GeneralGeofenceStatus) this.generalGeofenceStatusProvider.getCurrentStatus().getValue()).getClosestBuilding();
        if (closestBuilding != null) {
            linkedHashMap.put(a.CLOSEST_BUILDING_ID.getValue(), closestBuilding.getId());
        }
        this.customParamsAppender.appendCustomParams(linkedHashMap, z);
        if (metadata != null) {
            for (Map.Entry entry : MapsKt.q(metadata).entrySet()) {
                Object value2 = entry.getValue();
                if (value2 != null) {
                    linkedHashMap.put(entry.getKey(), value2);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final RemoteLog getOrCreateLog(RemoteLog currentLog, String url) {
        return (currentLog == null || !Intrinsics.c(url, currentLog.getUrl())) ? this.remoteLogFactory.createLog(url) : currentLog;
    }

    private final void logCaller(String tag) {
        Collection collectionW0;
        if (this.buildData.getDebug()) {
            Exception exc = new Exception();
            StackTraceElement[] stackTrace = exc.getStackTrace();
            if (stackTrace.length < 4) {
                getLogger().e(tag, "logCaller: not enough stack trace elements: ");
                exc.printStackTrace();
                return;
            }
            String string = stackTrace[3].toString();
            Intrinsics.g(string, "toString(...)");
            List listI = new Regex("\\.").i(string);
            if (listI.isEmpty()) {
                collectionW0 = EmptyList.d;
            } else {
                ListIterator listIterator = listI.listIterator(listI.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionW0 = CollectionsKt.w0(listI, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                collectionW0 = EmptyList.d;
            }
            String[] strArr = (String[]) collectionW0.toArray(new String[0]);
            if (strArr.length < 3) {
                Logger logger = getLogger();
                String string2 = Arrays.toString(strArr);
                Intrinsics.g(string2, "toString(...)");
                logger.e(tag, "logCaller: not enough parts in trace ".concat(string2));
                return;
            }
            getLogger().d(tag, "Called by: " + strArr[strArr.length - 3] + JwtParser.SEPARATOR_CHAR + strArr[strArr.length - 2] + JwtParser.SEPARATOR_CHAR + strArr[strArr.length - 1]);
        }
    }

    private final String prepareMessage(String message) {
        return androidx.camera.core.impl.b.D("\t", androidx.camera.core.impl.b.D("\n", message, ""), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void savePendingMessage(Map<String, ? extends Object> message) {
        getLogger().d(TAG, "Adding pending elog messages. so far " + this.pendingMessages.size());
        if (this.pendingMessages.size() > this.queueSize) {
            getLogger().d(TAG, "To many pending messages");
            this.pendingMessages.poll();
        }
        this.pendingMessages.add(message);
    }

    private final void sendLog(ELog.Level level, String tag, String message, Function0<? extends Map<String, ? extends Object>> metadata, RemoteLog log) {
        Exception exc;
        ELog.Level level2;
        Map<String, ? extends Object> map;
        if (shouldNotELog(level)) {
            return;
        }
        if (metadata != null) {
            try {
                map = (Map) metadata.invoke();
            } catch (Exception e) {
                exc = e;
                level2 = level;
                getLogger().e(TAG, level2.name() + ": failed to send ELog message " + exc.getMessage());
            }
        } else {
            map = null;
        }
        level2 = level;
        try {
            sendToServer(level2, tag, message, map, log);
        } catch (Exception e2) {
            exc = e2;
            getLogger().e(TAG, level2.name() + ": failed to send ELog message " + exc.getMessage());
        }
    }

    public static /* synthetic */ void sendLog$default(ELogImpl eLogImpl, ELog.Level level, String str, String str2, Function0 function0, RemoteLog remoteLog, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i & 16) != 0) {
            remoteLog = eLogImpl.remoteLog;
        }
        eLogImpl.sendLog(level, str, str2, function02, remoteLog);
    }

    private final void sendToServer(ELog.Level level, String tag, String message, Map<String, ? extends Object> metadata, RemoteLog log) {
        if (shouldNotELog(level)) {
            return;
        }
        BuildersKt.c(this.coroutineScope, null, null, new e(this, tag, message, metadata, log, null), 3);
    }

    public static /* synthetic */ void sendToServer$default(ELogImpl eLogImpl, ELog.Level level, String str, String str2, Map map, RemoteLog remoteLog, int i, Object obj) {
        if ((i & 16) != 0) {
            remoteLog = eLogImpl.remoteLog;
        }
        eLogImpl.sendToServer(level, str, str2, map, remoteLog);
    }

    private final boolean shouldNotELog(ELog.Level level) {
        return (getEnableLogging() && getLevel().shouldLog(level)) ? false : true;
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void api(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        api(tag, message, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void c(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        c(tag, message, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    @Nullable
    public Object clearAllLogs(double d, @NotNull Continuation<? super Unit> continuation) {
        Object objClearAllLogs;
        RemoteLog remoteLog = this.remoteLog;
        return (remoteLog == null || (objClearAllLogs = remoteLog.clearAllLogs(d, continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objClearAllLogs;
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void configure(@Nullable String url, int maxBatchSize, int retries, long sendingIntervalSeconds, int queueSize, boolean considerGeofenceAlwaysInside) {
        if (url == null || url.length() == 0) {
            this.remoteLog = null;
            this.immediateRemoteLog = null;
            return;
        }
        RemoteLog remoteLog = this.remoteLog;
        RemoteLog remoteLog2 = this.immediateRemoteLog;
        RemoteLog orCreateLog = getOrCreateLog(remoteLog, url);
        RemoteLog orCreateLog2 = getOrCreateLog(remoteLog2, url);
        orCreateLog.configure(new c(maxBatchSize, retries, sendingIntervalSeconds));
        orCreateLog2.configure(new d(maxBatchSize, retries));
        this.remoteLog = orCreateLog;
        this.immediateRemoteLog = orCreateLog2;
        this.queueSize = queueSize;
        this.considerGeofenceAlwaysInside = considerGeofenceAlwaysInside;
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        d(tag, message, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        e(tag, message, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public boolean getEnableLogging() {
        return this.enableLogging;
    }

    @Override // me.oriient.internal.services.elog.ELog
    @NotNull
    public ELog.Level getLevel() {
        return this.level;
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void i(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        i(tag, message, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void immediate(@NotNull String tag, @NotNull String message, @NotNull ELog.Level level) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(level, "level");
        immediate(tag, message, (Map<String, ? extends Object>) null, level);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void io(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        io(tag, message, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void setEnableLogging(boolean z) {
        this.enableLogging = z;
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void setLevel(@NotNull ELog.Level level) {
        Intrinsics.h(level, "<set-?>");
        this.level = level;
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void v(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        getLogger().v(tag, MESSAGES_PREFIX.concat(message));
        sendLog$default(this, ELog.Level.VERBOSE, tag, message, null, null, 24, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void w(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        w(tag, message, (Map<String, ? extends Object>) null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void api(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        try {
            String strConcat = API_TAG_PREFIX.concat(tag);
            getLogger().d(strConcat, MESSAGES_PREFIX.concat(message));
            if (this.buildData.getDebug()) {
                logCaller(strConcat);
            }
            sendToServer$default(this, ELog.Level.API, tag, message, metadata, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "api: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void c(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        try {
            getLogger().e(tag, MESSAGES_PREFIX.concat(message));
            sendToServer$default(this, ELog.Level.SEVERE, tag, message, metadata, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "c: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void d(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        try {
            getLogger().d(tag, MESSAGES_PREFIX.concat(message));
            sendToServer$default(this, ELog.Level.DEBUG, tag, message, metadata, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "d: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void e(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        try {
            getLogger().e(tag, MESSAGES_PREFIX.concat(message));
            sendToServer$default(this, ELog.Level.ERROR, tag, message, metadata, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "e: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void i(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        try {
            getLogger().i(tag, MESSAGES_PREFIX.concat(message));
            sendToServer$default(this, ELog.Level.INFO, tag, message, metadata, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "i: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void immediate(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata, @NotNull ELog.Level level) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(level, "level");
        try {
            int i = b.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                getLogger().i(tag, MESSAGES_PREFIX.concat(message));
            } else if (i == 2) {
                getLogger().w(tag, MESSAGES_PREFIX.concat(message));
            } else if (i == 3 || i == 4) {
                getLogger().e(tag, MESSAGES_PREFIX.concat(message));
            } else {
                getLogger().d(tag, MESSAGES_PREFIX.concat(message));
            }
            sendToServer(level, tag, message, metadata, this.immediateRemoteLog);
        } catch (Exception e) {
            getLogger().e(TAG, "immediate: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void io(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        try {
            getLogger().d(tag, MESSAGES_PREFIX.concat(message));
            sendToServer$default(this, ELog.Level.IO, tag, message, metadata, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "io: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void w(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        try {
            getLogger().w(tag, MESSAGES_PREFIX.concat(message));
            sendToServer$default(this, ELog.Level.WARNING, tag, message, metadata, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "w: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void v(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        try {
            getLogger().v(tag, MESSAGES_PREFIX.concat(message));
            sendToServer$default(this, ELog.Level.VERBOSE, tag, message, metadata, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "verbose: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void c(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        getLogger().e(tag, MESSAGES_PREFIX.concat(message));
        sendLog$default(this, ELog.Level.SEVERE, tag, message, metadata, null, 16, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void d(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        getLogger().d(tag, MESSAGES_PREFIX.concat(message));
        sendLog$default(this, ELog.Level.DEBUG, tag, message, metadata, null, 16, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void e(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        getLogger().e(tag, MESSAGES_PREFIX.concat(message));
        sendLog$default(this, ELog.Level.ERROR, tag, message, metadata, null, 16, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void i(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        getLogger().i(tag, MESSAGES_PREFIX.concat(message));
        sendLog$default(this, ELog.Level.INFO, tag, message, metadata, null, 16, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void io(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        getLogger().d(tag, MESSAGES_PREFIX.concat(message));
        sendLog$default(this, ELog.Level.IO, tag, message, metadata, null, 16, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void w(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        getLogger().w(tag, MESSAGES_PREFIX.concat(message));
        sendLog$default(this, ELog.Level.WARNING, tag, message, metadata, null, 16, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void v(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        sendLog$default(this, ELog.Level.VERBOSE, tag, message, metadata, null, 16, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void e(@NotNull String tag, @NotNull String message, @NotNull Throwable tr) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(tr, "tr");
        try {
            getLogger().e(tag, MESSAGES_PREFIX + message + ": " + tr.getMessage());
            sendToServer$default(this, ELog.Level.ERROR, tag, message, null, null, 16, null);
        } catch (Exception e) {
            getLogger().e(TAG, "e: failed to send ELog message: " + e.getMessage());
        }
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void api(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        String strConcat = API_TAG_PREFIX.concat(tag);
        getLogger().d(strConcat, MESSAGES_PREFIX.concat(message));
        if (this.buildData.getDebug()) {
            logCaller(strConcat);
        }
        sendLog$default(this, ELog.Level.API, tag, message, metadata, null, 16, null);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void immediate(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata, @NotNull ELog.Level level) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        Intrinsics.h(level, "level");
        int i = b.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 1) {
            getLogger().i(tag, MESSAGES_PREFIX.concat(message));
        } else if (i == 2) {
            getLogger().w(tag, MESSAGES_PREFIX.concat(message));
        } else if (i != 3 && i != 4) {
            getLogger().d(tag, MESSAGES_PREFIX.concat(message));
        } else {
            getLogger().e(tag, MESSAGES_PREFIX.concat(message));
        }
        sendLog(level, tag, message, metadata, this.immediateRemoteLog);
    }

    public /* synthetic */ ELogImpl(OsData osData, BuildData buildData, DeviceIdProvider deviceIdProvider, ELogRemoteLogFactory eLogRemoteLogFactory, ELogCustomParamsAppender eLogCustomParamsAppender, CoroutineContextProvider coroutineContextProvider, GeneralGeofenceStatusProvider generalGeofenceStatusProvider, RuntimeDataProvider runtimeDataProvider, ELog.Type type, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(osData, buildData, deviceIdProvider, eLogRemoteLogFactory, eLogCustomParamsAppender, coroutineContextProvider, generalGeofenceStatusProvider, runtimeDataProvider, (i & 256) != 0 ? ELog.Type.LOG : type);
    }
}
