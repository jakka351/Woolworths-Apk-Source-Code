package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bj\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ²\u00012\u00020\u0001:\u0004±\u0001²\u0001Bé\u0003\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010)\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\b\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\u000e\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107\u0012\b\u00109\u001a\u0004\u0018\u00010:¢\u0006\u0002\u0010;B§\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107¢\u0006\u0002\u0010<J\u0010\u0010r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010u\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010v\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010w\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010x\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010z\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010{\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010|\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010}\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010~\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010\u007f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0002\u0010GJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u0094\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010DJ\f\u0010\u0098\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\u0012\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107HÆ\u0003J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010>J²\u0004\u0010\u009f\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107HÆ\u0001¢\u0006\u0003\u0010 \u0001J\u0015\u0010¡\u0001\u001a\u00020\u00062\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÖ\u0001J\u0010\u0010¤\u0001\u001a\u00030¥\u0001H\u0000¢\u0006\u0003\b¦\u0001J\u000b\u0010§\u0001\u001a\u00030¨\u0001HÖ\u0001J.\u0010©\u0001\u001a\u00030ª\u00012\u0007\u0010«\u0001\u001a\u00020\u00002\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\b\u0010®\u0001\u001a\u00030¯\u0001HÁ\u0001¢\u0006\u0003\b°\u0001R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0015\u0010,\u001a\u0004\u0018\u00010)¢\u0006\n\n\u0002\u0010H\u001a\u0004\bF\u0010GR\u0015\u0010+\u001a\u0004\u0018\u00010)¢\u0006\n\n\u0002\u0010H\u001a\u0004\bI\u0010GR\u0015\u0010*\u001a\u0004\u0018\u00010)¢\u0006\n\n\u0002\u0010H\u001a\u0004\bJ\u0010GR\u0015\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010E\u001a\u0004\bK\u0010DR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bL\u0010>R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bM\u0010>R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bN\u0010>R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bO\u0010>R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bP\u0010>R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bQ\u0010>R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bR\u0010>R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010E\u001a\u0004\bS\u0010DR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\b\u001f\u0010>R\u0015\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\b!\u0010>R\u0015\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\b \u0010>R\u0013\u0010/\u001a\u0004\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bV\u0010AR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bW\u0010AR\u0015\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bX\u0010AR\u0015\u0010$\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bY\u0010AR\u0015\u0010%\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bZ\u0010AR\u0015\u0010&\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\b[\u0010AR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0019\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\b`\u0010AR\u0015\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010E\u001a\u0004\ba\u0010DR\u0015\u00102\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bb\u0010AR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bc\u0010AR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bd\u0010AR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\be\u0010AR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bf\u0010AR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bg\u0010AR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bh\u0010AR\u0015\u0010(\u001a\u0004\u0018\u00010)¢\u0006\n\n\u0002\u0010H\u001a\u0004\bi\u0010GR\u0015\u0010\"\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bj\u0010AR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bk\u0010AR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010E\u001a\u0004\bl\u0010DR\u0015\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bm\u0010>R\u0015\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bn\u0010AR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010B\u001a\u0004\bo\u0010AR\u0015\u0010-\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bp\u0010>R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010?\u001a\u0004\bq\u0010>¨\u0006³\u0001"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse;", "", "seen1", "", "seen2", "enableEnginePerformanceMonitor", "", "calibrationExpirationTimeMinutes", "", "sessionProgressLogsIntervalSeconds", "engineUpdatesBufferSize", "enableValidationUploading", "enableRestrictedAreasValidationUploading", "enablePositionsUploading", "enableSensorsDataUploading", "aggressiveMode", "enableEventsUploading", "uploadWriteToFileRecords", "uploadingMetadataUpdateIntervalSec", "uploadWriteToFileIntervalSec", "uploadChunkLengthSeconds", "uploadMaxSessionLengthMin", "enableUploadingRecovery", "useDiscretionaryUploading", "uploadRetryIntervalMinutes", "timeoutIntervalSecForUploadRequest", "metadataSessionTimeoutIntervalForResourceSeconds", "metadataSessiontimeoutIntervalForRequestSeconds", "taskRetryDelaySeconds", "taskRetryMaxDelaySeconds", "celluralAccessAllowanceDelayDays", "isCellularAccessAllowed", "isDelayedCellularAccessAllowed", "isConstrainedNetworkAccessAllowed", "uploadUrlTimeoutHoursInterval", "uploadingExpirationTimeDays", "minimumStorageLeftToUploadPositionsMb", "minimumStorageLeftToUploadSensorsMb", "minimumStorageLeftToUploadValidationsMb", "minimumStorageLeftToUploadEventsMb", "uploadTaskMaxDelayMin", "", "controlTaskMaxTimeMin", "controlTaskIntervalMin", "chargerTaskIntervalMin", "uploadingWifiRequired", "uploadingChargerRequired", "librariesValidationStrategy", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;", "startReportingRetryCount", "startReportingRetryInterval", "dataLoadingRetryRequestCount", "onDeviceCore", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;", "onDeviceCorePerBuilding", "", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigPerBuildingResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;Ljava/util/List;)V", "getAggressiveMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCalibrationExpirationTimeMinutes", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCelluralAccessAllowanceDelayDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChargerTaskIntervalMin", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getControlTaskIntervalMin", "getControlTaskMaxTimeMin", "getDataLoadingRetryRequestCount", "getEnableEnginePerformanceMonitor", "getEnableEventsUploading", "getEnablePositionsUploading", "getEnableRestrictedAreasValidationUploading", "getEnableSensorsDataUploading", "getEnableUploadingRecovery", "getEnableValidationUploading", "getEngineUpdatesBufferSize", "getLibrariesValidationStrategy", "()Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;", "getMetadataSessionTimeoutIntervalForResourceSeconds", "getMetadataSessiontimeoutIntervalForRequestSeconds", "getMinimumStorageLeftToUploadEventsMb", "getMinimumStorageLeftToUploadPositionsMb", "getMinimumStorageLeftToUploadSensorsMb", "getMinimumStorageLeftToUploadValidationsMb", "getOnDeviceCore", "()Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;", "getOnDeviceCorePerBuilding", "()Ljava/util/List;", "getSessionProgressLogsIntervalSeconds", "getStartReportingRetryCount", "getStartReportingRetryInterval", "getTaskRetryDelaySeconds", "getTaskRetryMaxDelaySeconds", "getTimeoutIntervalSecForUploadRequest", "getUploadChunkLengthSeconds", "getUploadMaxSessionLengthMin", "getUploadRetryIntervalMinutes", "getUploadTaskMaxDelayMin", "getUploadUrlTimeoutHoursInterval", "getUploadWriteToFileIntervalSec", "getUploadWriteToFileRecords", "getUploadingChargerRequired", "getUploadingExpirationTimeDays", "getUploadingMetadataUpdateIntervalSec", "getUploadingWifiRequired", "getUseDiscretionaryUploading", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig$EngineLibrariesValidationStrategy;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineCoreConfigResponse;Ljava/util/List;)Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse;", "equals", "other", "hashCode", "toSpecificEngineConfig", "Lme/oriient/internal/services/dataModel/engine/SpecificEngineConfig;", "toSpecificEngineConfig$internal_publishRelease", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class OnDeviceEngineConfigResponse {

    @Nullable
    private final Boolean aggressiveMode;

    @Nullable
    private final Double calibrationExpirationTimeMinutes;

    @Nullable
    private final Integer celluralAccessAllowanceDelayDays;

    @Nullable
    private final Long chargerTaskIntervalMin;

    @Nullable
    private final Long controlTaskIntervalMin;

    @Nullable
    private final Long controlTaskMaxTimeMin;

    @Nullable
    private final Integer dataLoadingRetryRequestCount;

    @Nullable
    private final Boolean enableEnginePerformanceMonitor;

    @Nullable
    private final Boolean enableEventsUploading;

    @Nullable
    private final Boolean enablePositionsUploading;

    @Nullable
    private final Boolean enableRestrictedAreasValidationUploading;

    @Nullable
    private final Boolean enableSensorsDataUploading;

    @Nullable
    private final Boolean enableUploadingRecovery;

    @Nullable
    private final Boolean enableValidationUploading;

    @Nullable
    private final Integer engineUpdatesBufferSize;

    @Nullable
    private final Boolean isCellularAccessAllowed;

    @Nullable
    private final Boolean isConstrainedNetworkAccessAllowed;

    @Nullable
    private final Boolean isDelayedCellularAccessAllowed;

    @Nullable
    private final SpecificEngineConfig.EngineLibrariesValidationStrategy librariesValidationStrategy;

    @Nullable
    private final Double metadataSessionTimeoutIntervalForResourceSeconds;

    @Nullable
    private final Double metadataSessiontimeoutIntervalForRequestSeconds;

    @Nullable
    private final Double minimumStorageLeftToUploadEventsMb;

    @Nullable
    private final Double minimumStorageLeftToUploadPositionsMb;

    @Nullable
    private final Double minimumStorageLeftToUploadSensorsMb;

    @Nullable
    private final Double minimumStorageLeftToUploadValidationsMb;

    @Nullable
    private final OnDeviceEngineCoreConfigResponse onDeviceCore;

    @Nullable
    private final List<OnDeviceEngineCoreConfigPerBuildingResponse> onDeviceCorePerBuilding;

    @Nullable
    private final Double sessionProgressLogsIntervalSeconds;

    @Nullable
    private final Integer startReportingRetryCount;

    @Nullable
    private final Double startReportingRetryInterval;

    @Nullable
    private final Double taskRetryDelaySeconds;

    @Nullable
    private final Double taskRetryMaxDelaySeconds;

    @Nullable
    private final Double timeoutIntervalSecForUploadRequest;

    @Nullable
    private final Double uploadChunkLengthSeconds;

    @Nullable
    private final Double uploadMaxSessionLengthMin;

    @Nullable
    private final Double uploadRetryIntervalMinutes;

    @Nullable
    private final Long uploadTaskMaxDelayMin;

    @Nullable
    private final Double uploadUrlTimeoutHoursInterval;

    @Nullable
    private final Double uploadWriteToFileIntervalSec;

    @Nullable
    private final Integer uploadWriteToFileRecords;

    @Nullable
    private final Boolean uploadingChargerRequired;

    @Nullable
    private final Double uploadingExpirationTimeDays;

    @Nullable
    private final Double uploadingMetadataUpdateIntervalSec;

    @Nullable
    private final Boolean uploadingWifiRequired;

    @Nullable
    private final Boolean useDiscretionaryUploading;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, SpecificEngineConfig.EngineLibrariesValidationStrategy.INSTANCE.serializer(), null, null, null, null, new ArrayListSerializer(OnDeviceEngineCoreConfigPerBuildingResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataModel/engine/OnDeviceEngineConfigResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<OnDeviceEngineConfigResponse> serializer() {
            return OnDeviceEngineConfigResponse$$serializer.INSTANCE;
        }
    }

    public OnDeviceEngineConfigResponse() {
        this((Boolean) null, (Double) null, (Double) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Long) null, (Long) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (SpecificEngineConfig.EngineLibrariesValidationStrategy) null, (Integer) null, (Double) null, (Integer) null, (OnDeviceEngineCoreConfigResponse) null, (List) null, -1, 8191, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(OnDeviceEngineConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.enableEnginePerformanceMonitor != null) {
            output.w(serialDesc, 0, BooleanSerializer.f24779a, self.enableEnginePerformanceMonitor);
        }
        if (output.q(serialDesc, 1) || self.calibrationExpirationTimeMinutes != null) {
            output.w(serialDesc, 1, DoubleSerializer.f24792a, self.calibrationExpirationTimeMinutes);
        }
        if (output.q(serialDesc, 2) || self.sessionProgressLogsIntervalSeconds != null) {
            output.w(serialDesc, 2, DoubleSerializer.f24792a, self.sessionProgressLogsIntervalSeconds);
        }
        if (output.q(serialDesc, 3) || self.engineUpdatesBufferSize != null) {
            output.w(serialDesc, 3, IntSerializer.f24800a, self.engineUpdatesBufferSize);
        }
        if (output.q(serialDesc, 4) || self.enableValidationUploading != null) {
            output.w(serialDesc, 4, BooleanSerializer.f24779a, self.enableValidationUploading);
        }
        if (output.q(serialDesc, 5) || self.enableRestrictedAreasValidationUploading != null) {
            output.w(serialDesc, 5, BooleanSerializer.f24779a, self.enableRestrictedAreasValidationUploading);
        }
        if (output.q(serialDesc, 6) || self.enablePositionsUploading != null) {
            output.w(serialDesc, 6, BooleanSerializer.f24779a, self.enablePositionsUploading);
        }
        if (output.q(serialDesc, 7) || self.enableSensorsDataUploading != null) {
            output.w(serialDesc, 7, BooleanSerializer.f24779a, self.enableSensorsDataUploading);
        }
        if (output.q(serialDesc, 8) || self.aggressiveMode != null) {
            output.w(serialDesc, 8, BooleanSerializer.f24779a, self.aggressiveMode);
        }
        if (output.q(serialDesc, 9) || self.enableEventsUploading != null) {
            output.w(serialDesc, 9, BooleanSerializer.f24779a, self.enableEventsUploading);
        }
        if (output.q(serialDesc, 10) || self.uploadWriteToFileRecords != null) {
            output.w(serialDesc, 10, IntSerializer.f24800a, self.uploadWriteToFileRecords);
        }
        if (output.q(serialDesc, 11) || self.uploadingMetadataUpdateIntervalSec != null) {
            output.w(serialDesc, 11, DoubleSerializer.f24792a, self.uploadingMetadataUpdateIntervalSec);
        }
        if (output.q(serialDesc, 12) || self.uploadWriteToFileIntervalSec != null) {
            output.w(serialDesc, 12, DoubleSerializer.f24792a, self.uploadWriteToFileIntervalSec);
        }
        if (output.q(serialDesc, 13) || self.uploadChunkLengthSeconds != null) {
            output.w(serialDesc, 13, DoubleSerializer.f24792a, self.uploadChunkLengthSeconds);
        }
        if (output.q(serialDesc, 14) || self.uploadMaxSessionLengthMin != null) {
            output.w(serialDesc, 14, DoubleSerializer.f24792a, self.uploadMaxSessionLengthMin);
        }
        if (output.q(serialDesc, 15) || self.enableUploadingRecovery != null) {
            output.w(serialDesc, 15, BooleanSerializer.f24779a, self.enableUploadingRecovery);
        }
        if (output.q(serialDesc, 16) || self.useDiscretionaryUploading != null) {
            output.w(serialDesc, 16, BooleanSerializer.f24779a, self.useDiscretionaryUploading);
        }
        if (output.q(serialDesc, 17) || self.uploadRetryIntervalMinutes != null) {
            output.w(serialDesc, 17, DoubleSerializer.f24792a, self.uploadRetryIntervalMinutes);
        }
        if (output.q(serialDesc, 18) || self.timeoutIntervalSecForUploadRequest != null) {
            output.w(serialDesc, 18, DoubleSerializer.f24792a, self.timeoutIntervalSecForUploadRequest);
        }
        if (output.q(serialDesc, 19) || self.metadataSessionTimeoutIntervalForResourceSeconds != null) {
            output.w(serialDesc, 19, DoubleSerializer.f24792a, self.metadataSessionTimeoutIntervalForResourceSeconds);
        }
        if (output.q(serialDesc, 20) || self.metadataSessiontimeoutIntervalForRequestSeconds != null) {
            output.w(serialDesc, 20, DoubleSerializer.f24792a, self.metadataSessiontimeoutIntervalForRequestSeconds);
        }
        if (output.q(serialDesc, 21) || self.taskRetryDelaySeconds != null) {
            output.w(serialDesc, 21, DoubleSerializer.f24792a, self.taskRetryDelaySeconds);
        }
        if (output.q(serialDesc, 22) || self.taskRetryMaxDelaySeconds != null) {
            output.w(serialDesc, 22, DoubleSerializer.f24792a, self.taskRetryMaxDelaySeconds);
        }
        if (output.q(serialDesc, 23) || self.celluralAccessAllowanceDelayDays != null) {
            output.w(serialDesc, 23, IntSerializer.f24800a, self.celluralAccessAllowanceDelayDays);
        }
        if (output.q(serialDesc, 24) || self.isCellularAccessAllowed != null) {
            output.w(serialDesc, 24, BooleanSerializer.f24779a, self.isCellularAccessAllowed);
        }
        if (output.q(serialDesc, 25) || self.isDelayedCellularAccessAllowed != null) {
            output.w(serialDesc, 25, BooleanSerializer.f24779a, self.isDelayedCellularAccessAllowed);
        }
        if (output.q(serialDesc, 26) || self.isConstrainedNetworkAccessAllowed != null) {
            output.w(serialDesc, 26, BooleanSerializer.f24779a, self.isConstrainedNetworkAccessAllowed);
        }
        if (output.q(serialDesc, 27) || self.uploadUrlTimeoutHoursInterval != null) {
            output.w(serialDesc, 27, DoubleSerializer.f24792a, self.uploadUrlTimeoutHoursInterval);
        }
        if (output.q(serialDesc, 28) || self.uploadingExpirationTimeDays != null) {
            output.w(serialDesc, 28, DoubleSerializer.f24792a, self.uploadingExpirationTimeDays);
        }
        if (output.q(serialDesc, 29) || self.minimumStorageLeftToUploadPositionsMb != null) {
            output.w(serialDesc, 29, DoubleSerializer.f24792a, self.minimumStorageLeftToUploadPositionsMb);
        }
        if (output.q(serialDesc, 30) || self.minimumStorageLeftToUploadSensorsMb != null) {
            output.w(serialDesc, 30, DoubleSerializer.f24792a, self.minimumStorageLeftToUploadSensorsMb);
        }
        if (output.q(serialDesc, 31) || self.minimumStorageLeftToUploadValidationsMb != null) {
            output.w(serialDesc, 31, DoubleSerializer.f24792a, self.minimumStorageLeftToUploadValidationsMb);
        }
        if (output.q(serialDesc, 32) || self.minimumStorageLeftToUploadEventsMb != null) {
            output.w(serialDesc, 32, DoubleSerializer.f24792a, self.minimumStorageLeftToUploadEventsMb);
        }
        if (output.q(serialDesc, 33) || self.uploadTaskMaxDelayMin != null) {
            output.w(serialDesc, 33, LongSerializer.f24804a, self.uploadTaskMaxDelayMin);
        }
        if (output.q(serialDesc, 34) || self.controlTaskMaxTimeMin != null) {
            output.w(serialDesc, 34, LongSerializer.f24804a, self.controlTaskMaxTimeMin);
        }
        if (output.q(serialDesc, 35) || self.controlTaskIntervalMin != null) {
            output.w(serialDesc, 35, LongSerializer.f24804a, self.controlTaskIntervalMin);
        }
        if (output.q(serialDesc, 36) || self.chargerTaskIntervalMin != null) {
            output.w(serialDesc, 36, LongSerializer.f24804a, self.chargerTaskIntervalMin);
        }
        if (output.q(serialDesc, 37) || self.uploadingWifiRequired != null) {
            output.w(serialDesc, 37, BooleanSerializer.f24779a, self.uploadingWifiRequired);
        }
        if (output.q(serialDesc, 38) || self.uploadingChargerRequired != null) {
            output.w(serialDesc, 38, BooleanSerializer.f24779a, self.uploadingChargerRequired);
        }
        if (output.q(serialDesc, 39) || self.librariesValidationStrategy != null) {
            output.w(serialDesc, 39, kSerializerArr[39], self.librariesValidationStrategy);
        }
        if (output.q(serialDesc, 40) || self.startReportingRetryCount != null) {
            output.w(serialDesc, 40, IntSerializer.f24800a, self.startReportingRetryCount);
        }
        if (output.q(serialDesc, 41) || self.startReportingRetryInterval != null) {
            output.w(serialDesc, 41, DoubleSerializer.f24792a, self.startReportingRetryInterval);
        }
        if (output.q(serialDesc, 42) || self.dataLoadingRetryRequestCount != null) {
            output.w(serialDesc, 42, IntSerializer.f24800a, self.dataLoadingRetryRequestCount);
        }
        if (output.q(serialDesc, 43) || self.onDeviceCore != null) {
            output.w(serialDesc, 43, OnDeviceEngineCoreConfigResponse$$serializer.INSTANCE, self.onDeviceCore);
        }
        if (!output.q(serialDesc, 44) && self.onDeviceCorePerBuilding == null) {
            return;
        }
        output.w(serialDesc, 44, kSerializerArr[44], self.onDeviceCorePerBuilding);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getEnableEnginePerformanceMonitor() {
        return this.enableEnginePerformanceMonitor;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getEnableEventsUploading() {
        return this.enableEventsUploading;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getUploadWriteToFileRecords() {
        return this.uploadWriteToFileRecords;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getUploadingMetadataUpdateIntervalSec() {
        return this.uploadingMetadataUpdateIntervalSec;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getUploadWriteToFileIntervalSec() {
        return this.uploadWriteToFileIntervalSec;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getUploadChunkLengthSeconds() {
        return this.uploadChunkLengthSeconds;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getUploadMaxSessionLengthMin() {
        return this.uploadMaxSessionLengthMin;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getEnableUploadingRecovery() {
        return this.enableUploadingRecovery;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Boolean getUseDiscretionaryUploading() {
        return this.useDiscretionaryUploading;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Double getUploadRetryIntervalMinutes() {
        return this.uploadRetryIntervalMinutes;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Double getTimeoutIntervalSecForUploadRequest() {
        return this.timeoutIntervalSecForUploadRequest;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getCalibrationExpirationTimeMinutes() {
        return this.calibrationExpirationTimeMinutes;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Double getMetadataSessionTimeoutIntervalForResourceSeconds() {
        return this.metadataSessionTimeoutIntervalForResourceSeconds;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Double getMetadataSessiontimeoutIntervalForRequestSeconds() {
        return this.metadataSessiontimeoutIntervalForRequestSeconds;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Double getTaskRetryDelaySeconds() {
        return this.taskRetryDelaySeconds;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Double getTaskRetryMaxDelaySeconds() {
        return this.taskRetryMaxDelaySeconds;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getCelluralAccessAllowanceDelayDays() {
        return this.celluralAccessAllowanceDelayDays;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Boolean getIsCellularAccessAllowed() {
        return this.isCellularAccessAllowed;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Boolean getIsDelayedCellularAccessAllowed() {
        return this.isDelayedCellularAccessAllowed;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Boolean getIsConstrainedNetworkAccessAllowed() {
        return this.isConstrainedNetworkAccessAllowed;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final Double getUploadUrlTimeoutHoursInterval() {
        return this.uploadUrlTimeoutHoursInterval;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Double getUploadingExpirationTimeDays() {
        return this.uploadingExpirationTimeDays;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getSessionProgressLogsIntervalSeconds() {
        return this.sessionProgressLogsIntervalSeconds;
    }

    @Nullable
    /* renamed from: component30, reason: from getter */
    public final Double getMinimumStorageLeftToUploadPositionsMb() {
        return this.minimumStorageLeftToUploadPositionsMb;
    }

    @Nullable
    /* renamed from: component31, reason: from getter */
    public final Double getMinimumStorageLeftToUploadSensorsMb() {
        return this.minimumStorageLeftToUploadSensorsMb;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Double getMinimumStorageLeftToUploadValidationsMb() {
        return this.minimumStorageLeftToUploadValidationsMb;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Double getMinimumStorageLeftToUploadEventsMb() {
        return this.minimumStorageLeftToUploadEventsMb;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final Long getUploadTaskMaxDelayMin() {
        return this.uploadTaskMaxDelayMin;
    }

    @Nullable
    /* renamed from: component35, reason: from getter */
    public final Long getControlTaskMaxTimeMin() {
        return this.controlTaskMaxTimeMin;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Long getControlTaskIntervalMin() {
        return this.controlTaskIntervalMin;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Long getChargerTaskIntervalMin() {
        return this.chargerTaskIntervalMin;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final Boolean getUploadingWifiRequired() {
        return this.uploadingWifiRequired;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final Boolean getUploadingChargerRequired() {
        return this.uploadingChargerRequired;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getEngineUpdatesBufferSize() {
        return this.engineUpdatesBufferSize;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final SpecificEngineConfig.EngineLibrariesValidationStrategy getLibrariesValidationStrategy() {
        return this.librariesValidationStrategy;
    }

    @Nullable
    /* renamed from: component41, reason: from getter */
    public final Integer getStartReportingRetryCount() {
        return this.startReportingRetryCount;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final Double getStartReportingRetryInterval() {
        return this.startReportingRetryInterval;
    }

    @Nullable
    /* renamed from: component43, reason: from getter */
    public final Integer getDataLoadingRetryRequestCount() {
        return this.dataLoadingRetryRequestCount;
    }

    @Nullable
    /* renamed from: component44, reason: from getter */
    public final OnDeviceEngineCoreConfigResponse getOnDeviceCore() {
        return this.onDeviceCore;
    }

    @Nullable
    public final List<OnDeviceEngineCoreConfigPerBuildingResponse> component45() {
        return this.onDeviceCorePerBuilding;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getEnableValidationUploading() {
        return this.enableValidationUploading;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getEnableRestrictedAreasValidationUploading() {
        return this.enableRestrictedAreasValidationUploading;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getEnablePositionsUploading() {
        return this.enablePositionsUploading;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getEnableSensorsDataUploading() {
        return this.enableSensorsDataUploading;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getAggressiveMode() {
        return this.aggressiveMode;
    }

    @NotNull
    public final OnDeviceEngineConfigResponse copy(@Nullable Boolean enableEnginePerformanceMonitor, @Nullable Double calibrationExpirationTimeMinutes, @Nullable Double sessionProgressLogsIntervalSeconds, @Nullable Integer engineUpdatesBufferSize, @Nullable Boolean enableValidationUploading, @Nullable Boolean enableRestrictedAreasValidationUploading, @Nullable Boolean enablePositionsUploading, @Nullable Boolean enableSensorsDataUploading, @Nullable Boolean aggressiveMode, @Nullable Boolean enableEventsUploading, @Nullable Integer uploadWriteToFileRecords, @Nullable Double uploadingMetadataUpdateIntervalSec, @Nullable Double uploadWriteToFileIntervalSec, @Nullable Double uploadChunkLengthSeconds, @Nullable Double uploadMaxSessionLengthMin, @Nullable Boolean enableUploadingRecovery, @Nullable Boolean useDiscretionaryUploading, @Nullable Double uploadRetryIntervalMinutes, @Nullable Double timeoutIntervalSecForUploadRequest, @Nullable Double metadataSessionTimeoutIntervalForResourceSeconds, @Nullable Double metadataSessiontimeoutIntervalForRequestSeconds, @Nullable Double taskRetryDelaySeconds, @Nullable Double taskRetryMaxDelaySeconds, @Nullable Integer celluralAccessAllowanceDelayDays, @Nullable Boolean isCellularAccessAllowed, @Nullable Boolean isDelayedCellularAccessAllowed, @Nullable Boolean isConstrainedNetworkAccessAllowed, @Nullable Double uploadUrlTimeoutHoursInterval, @Nullable Double uploadingExpirationTimeDays, @Nullable Double minimumStorageLeftToUploadPositionsMb, @Nullable Double minimumStorageLeftToUploadSensorsMb, @Nullable Double minimumStorageLeftToUploadValidationsMb, @Nullable Double minimumStorageLeftToUploadEventsMb, @Nullable Long uploadTaskMaxDelayMin, @Nullable Long controlTaskMaxTimeMin, @Nullable Long controlTaskIntervalMin, @Nullable Long chargerTaskIntervalMin, @Nullable Boolean uploadingWifiRequired, @Nullable Boolean uploadingChargerRequired, @Nullable SpecificEngineConfig.EngineLibrariesValidationStrategy librariesValidationStrategy, @Nullable Integer startReportingRetryCount, @Nullable Double startReportingRetryInterval, @Nullable Integer dataLoadingRetryRequestCount, @Nullable OnDeviceEngineCoreConfigResponse onDeviceCore, @Nullable List<OnDeviceEngineCoreConfigPerBuildingResponse> onDeviceCorePerBuilding) {
        return new OnDeviceEngineConfigResponse(enableEnginePerformanceMonitor, calibrationExpirationTimeMinutes, sessionProgressLogsIntervalSeconds, engineUpdatesBufferSize, enableValidationUploading, enableRestrictedAreasValidationUploading, enablePositionsUploading, enableSensorsDataUploading, aggressiveMode, enableEventsUploading, uploadWriteToFileRecords, uploadingMetadataUpdateIntervalSec, uploadWriteToFileIntervalSec, uploadChunkLengthSeconds, uploadMaxSessionLengthMin, enableUploadingRecovery, useDiscretionaryUploading, uploadRetryIntervalMinutes, timeoutIntervalSecForUploadRequest, metadataSessionTimeoutIntervalForResourceSeconds, metadataSessiontimeoutIntervalForRequestSeconds, taskRetryDelaySeconds, taskRetryMaxDelaySeconds, celluralAccessAllowanceDelayDays, isCellularAccessAllowed, isDelayedCellularAccessAllowed, isConstrainedNetworkAccessAllowed, uploadUrlTimeoutHoursInterval, uploadingExpirationTimeDays, minimumStorageLeftToUploadPositionsMb, minimumStorageLeftToUploadSensorsMb, minimumStorageLeftToUploadValidationsMb, minimumStorageLeftToUploadEventsMb, uploadTaskMaxDelayMin, controlTaskMaxTimeMin, controlTaskIntervalMin, chargerTaskIntervalMin, uploadingWifiRequired, uploadingChargerRequired, librariesValidationStrategy, startReportingRetryCount, startReportingRetryInterval, dataLoadingRetryRequestCount, onDeviceCore, onDeviceCorePerBuilding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnDeviceEngineConfigResponse)) {
            return false;
        }
        OnDeviceEngineConfigResponse onDeviceEngineConfigResponse = (OnDeviceEngineConfigResponse) other;
        return Intrinsics.c(this.enableEnginePerformanceMonitor, onDeviceEngineConfigResponse.enableEnginePerformanceMonitor) && Intrinsics.c(this.calibrationExpirationTimeMinutes, onDeviceEngineConfigResponse.calibrationExpirationTimeMinutes) && Intrinsics.c(this.sessionProgressLogsIntervalSeconds, onDeviceEngineConfigResponse.sessionProgressLogsIntervalSeconds) && Intrinsics.c(this.engineUpdatesBufferSize, onDeviceEngineConfigResponse.engineUpdatesBufferSize) && Intrinsics.c(this.enableValidationUploading, onDeviceEngineConfigResponse.enableValidationUploading) && Intrinsics.c(this.enableRestrictedAreasValidationUploading, onDeviceEngineConfigResponse.enableRestrictedAreasValidationUploading) && Intrinsics.c(this.enablePositionsUploading, onDeviceEngineConfigResponse.enablePositionsUploading) && Intrinsics.c(this.enableSensorsDataUploading, onDeviceEngineConfigResponse.enableSensorsDataUploading) && Intrinsics.c(this.aggressiveMode, onDeviceEngineConfigResponse.aggressiveMode) && Intrinsics.c(this.enableEventsUploading, onDeviceEngineConfigResponse.enableEventsUploading) && Intrinsics.c(this.uploadWriteToFileRecords, onDeviceEngineConfigResponse.uploadWriteToFileRecords) && Intrinsics.c(this.uploadingMetadataUpdateIntervalSec, onDeviceEngineConfigResponse.uploadingMetadataUpdateIntervalSec) && Intrinsics.c(this.uploadWriteToFileIntervalSec, onDeviceEngineConfigResponse.uploadWriteToFileIntervalSec) && Intrinsics.c(this.uploadChunkLengthSeconds, onDeviceEngineConfigResponse.uploadChunkLengthSeconds) && Intrinsics.c(this.uploadMaxSessionLengthMin, onDeviceEngineConfigResponse.uploadMaxSessionLengthMin) && Intrinsics.c(this.enableUploadingRecovery, onDeviceEngineConfigResponse.enableUploadingRecovery) && Intrinsics.c(this.useDiscretionaryUploading, onDeviceEngineConfigResponse.useDiscretionaryUploading) && Intrinsics.c(this.uploadRetryIntervalMinutes, onDeviceEngineConfigResponse.uploadRetryIntervalMinutes) && Intrinsics.c(this.timeoutIntervalSecForUploadRequest, onDeviceEngineConfigResponse.timeoutIntervalSecForUploadRequest) && Intrinsics.c(this.metadataSessionTimeoutIntervalForResourceSeconds, onDeviceEngineConfigResponse.metadataSessionTimeoutIntervalForResourceSeconds) && Intrinsics.c(this.metadataSessiontimeoutIntervalForRequestSeconds, onDeviceEngineConfigResponse.metadataSessiontimeoutIntervalForRequestSeconds) && Intrinsics.c(this.taskRetryDelaySeconds, onDeviceEngineConfigResponse.taskRetryDelaySeconds) && Intrinsics.c(this.taskRetryMaxDelaySeconds, onDeviceEngineConfigResponse.taskRetryMaxDelaySeconds) && Intrinsics.c(this.celluralAccessAllowanceDelayDays, onDeviceEngineConfigResponse.celluralAccessAllowanceDelayDays) && Intrinsics.c(this.isCellularAccessAllowed, onDeviceEngineConfigResponse.isCellularAccessAllowed) && Intrinsics.c(this.isDelayedCellularAccessAllowed, onDeviceEngineConfigResponse.isDelayedCellularAccessAllowed) && Intrinsics.c(this.isConstrainedNetworkAccessAllowed, onDeviceEngineConfigResponse.isConstrainedNetworkAccessAllowed) && Intrinsics.c(this.uploadUrlTimeoutHoursInterval, onDeviceEngineConfigResponse.uploadUrlTimeoutHoursInterval) && Intrinsics.c(this.uploadingExpirationTimeDays, onDeviceEngineConfigResponse.uploadingExpirationTimeDays) && Intrinsics.c(this.minimumStorageLeftToUploadPositionsMb, onDeviceEngineConfigResponse.minimumStorageLeftToUploadPositionsMb) && Intrinsics.c(this.minimumStorageLeftToUploadSensorsMb, onDeviceEngineConfigResponse.minimumStorageLeftToUploadSensorsMb) && Intrinsics.c(this.minimumStorageLeftToUploadValidationsMb, onDeviceEngineConfigResponse.minimumStorageLeftToUploadValidationsMb) && Intrinsics.c(this.minimumStorageLeftToUploadEventsMb, onDeviceEngineConfigResponse.minimumStorageLeftToUploadEventsMb) && Intrinsics.c(this.uploadTaskMaxDelayMin, onDeviceEngineConfigResponse.uploadTaskMaxDelayMin) && Intrinsics.c(this.controlTaskMaxTimeMin, onDeviceEngineConfigResponse.controlTaskMaxTimeMin) && Intrinsics.c(this.controlTaskIntervalMin, onDeviceEngineConfigResponse.controlTaskIntervalMin) && Intrinsics.c(this.chargerTaskIntervalMin, onDeviceEngineConfigResponse.chargerTaskIntervalMin) && Intrinsics.c(this.uploadingWifiRequired, onDeviceEngineConfigResponse.uploadingWifiRequired) && Intrinsics.c(this.uploadingChargerRequired, onDeviceEngineConfigResponse.uploadingChargerRequired) && this.librariesValidationStrategy == onDeviceEngineConfigResponse.librariesValidationStrategy && Intrinsics.c(this.startReportingRetryCount, onDeviceEngineConfigResponse.startReportingRetryCount) && Intrinsics.c(this.startReportingRetryInterval, onDeviceEngineConfigResponse.startReportingRetryInterval) && Intrinsics.c(this.dataLoadingRetryRequestCount, onDeviceEngineConfigResponse.dataLoadingRetryRequestCount) && Intrinsics.c(this.onDeviceCore, onDeviceEngineConfigResponse.onDeviceCore) && Intrinsics.c(this.onDeviceCorePerBuilding, onDeviceEngineConfigResponse.onDeviceCorePerBuilding);
    }

    @Nullable
    public final Boolean getAggressiveMode() {
        return this.aggressiveMode;
    }

    @Nullable
    public final Double getCalibrationExpirationTimeMinutes() {
        return this.calibrationExpirationTimeMinutes;
    }

    @Nullable
    public final Integer getCelluralAccessAllowanceDelayDays() {
        return this.celluralAccessAllowanceDelayDays;
    }

    @Nullable
    public final Long getChargerTaskIntervalMin() {
        return this.chargerTaskIntervalMin;
    }

    @Nullable
    public final Long getControlTaskIntervalMin() {
        return this.controlTaskIntervalMin;
    }

    @Nullable
    public final Long getControlTaskMaxTimeMin() {
        return this.controlTaskMaxTimeMin;
    }

    @Nullable
    public final Integer getDataLoadingRetryRequestCount() {
        return this.dataLoadingRetryRequestCount;
    }

    @Nullable
    public final Boolean getEnableEnginePerformanceMonitor() {
        return this.enableEnginePerformanceMonitor;
    }

    @Nullable
    public final Boolean getEnableEventsUploading() {
        return this.enableEventsUploading;
    }

    @Nullable
    public final Boolean getEnablePositionsUploading() {
        return this.enablePositionsUploading;
    }

    @Nullable
    public final Boolean getEnableRestrictedAreasValidationUploading() {
        return this.enableRestrictedAreasValidationUploading;
    }

    @Nullable
    public final Boolean getEnableSensorsDataUploading() {
        return this.enableSensorsDataUploading;
    }

    @Nullable
    public final Boolean getEnableUploadingRecovery() {
        return this.enableUploadingRecovery;
    }

    @Nullable
    public final Boolean getEnableValidationUploading() {
        return this.enableValidationUploading;
    }

    @Nullable
    public final Integer getEngineUpdatesBufferSize() {
        return this.engineUpdatesBufferSize;
    }

    @Nullable
    public final SpecificEngineConfig.EngineLibrariesValidationStrategy getLibrariesValidationStrategy() {
        return this.librariesValidationStrategy;
    }

    @Nullable
    public final Double getMetadataSessionTimeoutIntervalForResourceSeconds() {
        return this.metadataSessionTimeoutIntervalForResourceSeconds;
    }

    @Nullable
    public final Double getMetadataSessiontimeoutIntervalForRequestSeconds() {
        return this.metadataSessiontimeoutIntervalForRequestSeconds;
    }

    @Nullable
    public final Double getMinimumStorageLeftToUploadEventsMb() {
        return this.minimumStorageLeftToUploadEventsMb;
    }

    @Nullable
    public final Double getMinimumStorageLeftToUploadPositionsMb() {
        return this.minimumStorageLeftToUploadPositionsMb;
    }

    @Nullable
    public final Double getMinimumStorageLeftToUploadSensorsMb() {
        return this.minimumStorageLeftToUploadSensorsMb;
    }

    @Nullable
    public final Double getMinimumStorageLeftToUploadValidationsMb() {
        return this.minimumStorageLeftToUploadValidationsMb;
    }

    @Nullable
    public final OnDeviceEngineCoreConfigResponse getOnDeviceCore() {
        return this.onDeviceCore;
    }

    @Nullable
    public final List<OnDeviceEngineCoreConfigPerBuildingResponse> getOnDeviceCorePerBuilding() {
        return this.onDeviceCorePerBuilding;
    }

    @Nullable
    public final Double getSessionProgressLogsIntervalSeconds() {
        return this.sessionProgressLogsIntervalSeconds;
    }

    @Nullable
    public final Integer getStartReportingRetryCount() {
        return this.startReportingRetryCount;
    }

    @Nullable
    public final Double getStartReportingRetryInterval() {
        return this.startReportingRetryInterval;
    }

    @Nullable
    public final Double getTaskRetryDelaySeconds() {
        return this.taskRetryDelaySeconds;
    }

    @Nullable
    public final Double getTaskRetryMaxDelaySeconds() {
        return this.taskRetryMaxDelaySeconds;
    }

    @Nullable
    public final Double getTimeoutIntervalSecForUploadRequest() {
        return this.timeoutIntervalSecForUploadRequest;
    }

    @Nullable
    public final Double getUploadChunkLengthSeconds() {
        return this.uploadChunkLengthSeconds;
    }

    @Nullable
    public final Double getUploadMaxSessionLengthMin() {
        return this.uploadMaxSessionLengthMin;
    }

    @Nullable
    public final Double getUploadRetryIntervalMinutes() {
        return this.uploadRetryIntervalMinutes;
    }

    @Nullable
    public final Long getUploadTaskMaxDelayMin() {
        return this.uploadTaskMaxDelayMin;
    }

    @Nullable
    public final Double getUploadUrlTimeoutHoursInterval() {
        return this.uploadUrlTimeoutHoursInterval;
    }

    @Nullable
    public final Double getUploadWriteToFileIntervalSec() {
        return this.uploadWriteToFileIntervalSec;
    }

    @Nullable
    public final Integer getUploadWriteToFileRecords() {
        return this.uploadWriteToFileRecords;
    }

    @Nullable
    public final Boolean getUploadingChargerRequired() {
        return this.uploadingChargerRequired;
    }

    @Nullable
    public final Double getUploadingExpirationTimeDays() {
        return this.uploadingExpirationTimeDays;
    }

    @Nullable
    public final Double getUploadingMetadataUpdateIntervalSec() {
        return this.uploadingMetadataUpdateIntervalSec;
    }

    @Nullable
    public final Boolean getUploadingWifiRequired() {
        return this.uploadingWifiRequired;
    }

    @Nullable
    public final Boolean getUseDiscretionaryUploading() {
        return this.useDiscretionaryUploading;
    }

    public int hashCode() {
        Boolean bool = this.enableEnginePerformanceMonitor;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.calibrationExpirationTimeMinutes;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.sessionProgressLogsIntervalSeconds;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.engineUpdatesBufferSize;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.enableValidationUploading;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableRestrictedAreasValidationUploading;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enablePositionsUploading;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.enableSensorsDataUploading;
        int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.aggressiveMode;
        int iHashCode9 = (iHashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.enableEventsUploading;
        int iHashCode10 = (iHashCode9 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num2 = this.uploadWriteToFileRecords;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d3 = this.uploadingMetadataUpdateIntervalSec;
        int iHashCode12 = (iHashCode11 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.uploadWriteToFileIntervalSec;
        int iHashCode13 = (iHashCode12 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.uploadChunkLengthSeconds;
        int iHashCode14 = (iHashCode13 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.uploadMaxSessionLengthMin;
        int iHashCode15 = (iHashCode14 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Boolean bool8 = this.enableUploadingRecovery;
        int iHashCode16 = (iHashCode15 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.useDiscretionaryUploading;
        int iHashCode17 = (iHashCode16 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Double d7 = this.uploadRetryIntervalMinutes;
        int iHashCode18 = (iHashCode17 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.timeoutIntervalSecForUploadRequest;
        int iHashCode19 = (iHashCode18 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.metadataSessionTimeoutIntervalForResourceSeconds;
        int iHashCode20 = (iHashCode19 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.metadataSessiontimeoutIntervalForRequestSeconds;
        int iHashCode21 = (iHashCode20 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.taskRetryDelaySeconds;
        int iHashCode22 = (iHashCode21 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.taskRetryMaxDelaySeconds;
        int iHashCode23 = (iHashCode22 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num3 = this.celluralAccessAllowanceDelayDays;
        int iHashCode24 = (iHashCode23 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool10 = this.isCellularAccessAllowed;
        int iHashCode25 = (iHashCode24 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isDelayedCellularAccessAllowed;
        int iHashCode26 = (iHashCode25 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.isConstrainedNetworkAccessAllowed;
        int iHashCode27 = (iHashCode26 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Double d13 = this.uploadUrlTimeoutHoursInterval;
        int iHashCode28 = (iHashCode27 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.uploadingExpirationTimeDays;
        int iHashCode29 = (iHashCode28 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.minimumStorageLeftToUploadPositionsMb;
        int iHashCode30 = (iHashCode29 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.minimumStorageLeftToUploadSensorsMb;
        int iHashCode31 = (iHashCode30 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.minimumStorageLeftToUploadValidationsMb;
        int iHashCode32 = (iHashCode31 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.minimumStorageLeftToUploadEventsMb;
        int iHashCode33 = (iHashCode32 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Long l = this.uploadTaskMaxDelayMin;
        int iHashCode34 = (iHashCode33 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.controlTaskMaxTimeMin;
        int iHashCode35 = (iHashCode34 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.controlTaskIntervalMin;
        int iHashCode36 = (iHashCode35 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.chargerTaskIntervalMin;
        int iHashCode37 = (iHashCode36 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool13 = this.uploadingWifiRequired;
        int iHashCode38 = (iHashCode37 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.uploadingChargerRequired;
        int iHashCode39 = (iHashCode38 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        SpecificEngineConfig.EngineLibrariesValidationStrategy engineLibrariesValidationStrategy = this.librariesValidationStrategy;
        int iHashCode40 = (iHashCode39 + (engineLibrariesValidationStrategy == null ? 0 : engineLibrariesValidationStrategy.hashCode())) * 31;
        Integer num4 = this.startReportingRetryCount;
        int iHashCode41 = (iHashCode40 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d19 = this.startReportingRetryInterval;
        int iHashCode42 = (iHashCode41 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Integer num5 = this.dataLoadingRetryRequestCount;
        int iHashCode43 = (iHashCode42 + (num5 == null ? 0 : num5.hashCode())) * 31;
        OnDeviceEngineCoreConfigResponse onDeviceEngineCoreConfigResponse = this.onDeviceCore;
        int iHashCode44 = (iHashCode43 + (onDeviceEngineCoreConfigResponse == null ? 0 : onDeviceEngineCoreConfigResponse.hashCode())) * 31;
        List<OnDeviceEngineCoreConfigPerBuildingResponse> list = this.onDeviceCorePerBuilding;
        return iHashCode44 + (list != null ? list.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCellularAccessAllowed() {
        return this.isCellularAccessAllowed;
    }

    @Nullable
    public final Boolean isConstrainedNetworkAccessAllowed() {
        return this.isConstrainedNetworkAccessAllowed;
    }

    @Nullable
    public final Boolean isDelayedCellularAccessAllowed() {
        return this.isDelayedCellularAccessAllowed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @NotNull
    public final SpecificEngineConfig toSpecificEngineConfig$internal_publishRelease() {
        OnDeviceEngineCoreConfig config;
        ?? arrayList;
        Boolean bool = this.enableEnginePerformanceMonitor;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Double d = this.calibrationExpirationTimeMinutes;
        double dDoubleValue = d != null ? d.doubleValue() : TimeUnit.HOURS.toMinutes(1L);
        Double d2 = this.sessionProgressLogsIntervalSeconds;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : TimeUnit.HOURS.toMinutes(5L);
        Integer num = this.engineUpdatesBufferSize;
        int iIntValue = num != null ? num.intValue() : 100;
        Boolean bool2 = this.enableValidationUploading;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = this.enablePositionsUploading;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = this.enableSensorsDataUploading;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = this.enableRestrictedAreasValidationUploading;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : true;
        Boolean bool6 = this.aggressiveMode;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        Boolean bool7 = this.enableEventsUploading;
        boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        Integer num2 = this.uploadWriteToFileRecords;
        int iIntValue2 = num2 != null ? num2.intValue() : 100;
        Double d3 = this.uploadWriteToFileIntervalSec;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 5.0d;
        Double d4 = this.uploadingMetadataUpdateIntervalSec;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 1.0d;
        Double d5 = this.uploadChunkLengthSeconds;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 900.0d;
        Double d6 = this.uploadMaxSessionLengthMin;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 1440.0d;
        Double d7 = this.uploadingExpirationTimeDays;
        double dDoubleValue7 = d7 != null ? d7.doubleValue() : 7.0d;
        Long l = this.uploadTaskMaxDelayMin;
        long jLongValue = l != null ? l.longValue() : 720L;
        Long l2 = this.controlTaskIntervalMin;
        long jLongValue2 = l2 != null ? l2.longValue() : 120L;
        Long l3 = this.controlTaskMaxTimeMin;
        long jLongValue3 = l3 != null ? l3.longValue() : 2880L;
        Long l4 = this.chargerTaskIntervalMin;
        long jLongValue4 = l4 != null ? l4.longValue() : 15L;
        Boolean bool8 = this.uploadingChargerRequired;
        boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : false;
        Boolean bool9 = this.uploadingWifiRequired;
        boolean zBooleanValue9 = bool9 != null ? bool9.booleanValue() : true;
        Double d8 = this.minimumStorageLeftToUploadPositionsMb;
        double dDoubleValue8 = d8 != null ? d8.doubleValue() : 1024.0d;
        Double d9 = this.minimumStorageLeftToUploadSensorsMb;
        double dDoubleValue9 = d9 != null ? d9.doubleValue() : 3072.0d;
        Double d10 = this.minimumStorageLeftToUploadValidationsMb;
        double dDoubleValue10 = d10 != null ? d10.doubleValue() : 150.0d;
        Double d11 = this.minimumStorageLeftToUploadEventsMb;
        SpecificEngineConfig.Uploading uploading = new SpecificEngineConfig.Uploading(zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, iIntValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, jLongValue, jLongValue3, jLongValue2, jLongValue4, zBooleanValue9, zBooleanValue8, dDoubleValue8, dDoubleValue9, dDoubleValue10, d11 != null ? d11.doubleValue() : 150.0d);
        SpecificEngineConfig.EngineLibrariesValidationStrategy engineLibrariesValidationStrategy = this.librariesValidationStrategy;
        if (engineLibrariesValidationStrategy == null) {
            engineLibrariesValidationStrategy = SpecificEngineConfig.EngineLibrariesValidationStrategy.DENY_SERVICE;
        }
        SpecificEngineConfig.EngineLibrariesValidationStrategy engineLibrariesValidationStrategy2 = engineLibrariesValidationStrategy;
        OnDeviceEngineCoreConfigResponse onDeviceEngineCoreConfigResponse = this.onDeviceCore;
        if (onDeviceEngineCoreConfigResponse == null || (config = onDeviceEngineCoreConfigResponse.toConfig()) == null) {
            config = new OnDeviceEngineCoreConfigResponse((RtEngineConfigResponse) null, 1, (DefaultConstructorMarker) null).toConfig();
        }
        List<OnDeviceEngineCoreConfigPerBuildingResponse> list = this.onDeviceCorePerBuilding;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((OnDeviceEngineCoreConfigPerBuildingResponse) it.next()).toConfig());
            }
        } else {
            arrayList = EmptyList.d;
        }
        OnDeviceEngineCoreConfigProvider onDeviceEngineCoreConfigProvider = new OnDeviceEngineCoreConfigProvider(config, arrayList);
        Integer num3 = this.startReportingRetryCount;
        int iIntValue3 = num3 != null ? num3.intValue() : 3;
        Double d12 = this.startReportingRetryInterval;
        return new SpecificEngineConfig(zBooleanValue, dDoubleValue, dDoubleValue2, iIntValue, uploading, engineLibrariesValidationStrategy2, onDeviceEngineCoreConfigProvider, iIntValue3, d12 != null ? d12.doubleValue() : 1.0d);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceEngineConfigResponse(enableEnginePerformanceMonitor=");
        sb.append(this.enableEnginePerformanceMonitor);
        sb.append(", calibrationExpirationTimeMinutes=");
        sb.append(this.calibrationExpirationTimeMinutes);
        sb.append(", sessionProgressLogsIntervalSeconds=");
        sb.append(this.sessionProgressLogsIntervalSeconds);
        sb.append(", engineUpdatesBufferSize=");
        sb.append(this.engineUpdatesBufferSize);
        sb.append(", enableValidationUploading=");
        sb.append(this.enableValidationUploading);
        sb.append(", enableRestrictedAreasValidationUploading=");
        sb.append(this.enableRestrictedAreasValidationUploading);
        sb.append(", enablePositionsUploading=");
        sb.append(this.enablePositionsUploading);
        sb.append(", enableSensorsDataUploading=");
        sb.append(this.enableSensorsDataUploading);
        sb.append(", aggressiveMode=");
        sb.append(this.aggressiveMode);
        sb.append(", enableEventsUploading=");
        sb.append(this.enableEventsUploading);
        sb.append(", uploadWriteToFileRecords=");
        sb.append(this.uploadWriteToFileRecords);
        sb.append(", uploadingMetadataUpdateIntervalSec=");
        sb.append(this.uploadingMetadataUpdateIntervalSec);
        sb.append(", uploadWriteToFileIntervalSec=");
        sb.append(this.uploadWriteToFileIntervalSec);
        sb.append(", uploadChunkLengthSeconds=");
        sb.append(this.uploadChunkLengthSeconds);
        sb.append(", uploadMaxSessionLengthMin=");
        sb.append(this.uploadMaxSessionLengthMin);
        sb.append(", enableUploadingRecovery=");
        sb.append(this.enableUploadingRecovery);
        sb.append(", useDiscretionaryUploading=");
        sb.append(this.useDiscretionaryUploading);
        sb.append(", uploadRetryIntervalMinutes=");
        sb.append(this.uploadRetryIntervalMinutes);
        sb.append(", timeoutIntervalSecForUploadRequest=");
        sb.append(this.timeoutIntervalSecForUploadRequest);
        sb.append(", metadataSessionTimeoutIntervalForResourceSeconds=");
        sb.append(this.metadataSessionTimeoutIntervalForResourceSeconds);
        sb.append(", metadataSessiontimeoutIntervalForRequestSeconds=");
        sb.append(this.metadataSessiontimeoutIntervalForRequestSeconds);
        sb.append(", taskRetryDelaySeconds=");
        sb.append(this.taskRetryDelaySeconds);
        sb.append(", taskRetryMaxDelaySeconds=");
        sb.append(this.taskRetryMaxDelaySeconds);
        sb.append(", celluralAccessAllowanceDelayDays=");
        sb.append(this.celluralAccessAllowanceDelayDays);
        sb.append(", isCellularAccessAllowed=");
        sb.append(this.isCellularAccessAllowed);
        sb.append(", isDelayedCellularAccessAllowed=");
        sb.append(this.isDelayedCellularAccessAllowed);
        sb.append(", isConstrainedNetworkAccessAllowed=");
        sb.append(this.isConstrainedNetworkAccessAllowed);
        sb.append(", uploadUrlTimeoutHoursInterval=");
        sb.append(this.uploadUrlTimeoutHoursInterval);
        sb.append(", uploadingExpirationTimeDays=");
        sb.append(this.uploadingExpirationTimeDays);
        sb.append(", minimumStorageLeftToUploadPositionsMb=");
        sb.append(this.minimumStorageLeftToUploadPositionsMb);
        sb.append(", minimumStorageLeftToUploadSensorsMb=");
        sb.append(this.minimumStorageLeftToUploadSensorsMb);
        sb.append(", minimumStorageLeftToUploadValidationsMb=");
        sb.append(this.minimumStorageLeftToUploadValidationsMb);
        sb.append(", minimumStorageLeftToUploadEventsMb=");
        sb.append(this.minimumStorageLeftToUploadEventsMb);
        sb.append(", uploadTaskMaxDelayMin=");
        sb.append(this.uploadTaskMaxDelayMin);
        sb.append(", controlTaskMaxTimeMin=");
        sb.append(this.controlTaskMaxTimeMin);
        sb.append(", controlTaskIntervalMin=");
        sb.append(this.controlTaskIntervalMin);
        sb.append(", chargerTaskIntervalMin=");
        sb.append(this.chargerTaskIntervalMin);
        sb.append(", uploadingWifiRequired=");
        sb.append(this.uploadingWifiRequired);
        sb.append(", uploadingChargerRequired=");
        sb.append(this.uploadingChargerRequired);
        sb.append(", librariesValidationStrategy=");
        sb.append(this.librariesValidationStrategy);
        sb.append(", startReportingRetryCount=");
        sb.append(this.startReportingRetryCount);
        sb.append(", startReportingRetryInterval=");
        sb.append(this.startReportingRetryInterval);
        sb.append(", dataLoadingRetryRequestCount=");
        sb.append(this.dataLoadingRetryRequestCount);
        sb.append(", onDeviceCore=");
        sb.append(this.onDeviceCore);
        sb.append(", onDeviceCorePerBuilding=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.onDeviceCorePerBuilding, ')');
    }

    @Deprecated
    public /* synthetic */ OnDeviceEngineConfigResponse(int i, int i2, Boolean bool, Double d, Double d2, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num2, Double d3, Double d4, Double d5, Double d6, Boolean bool8, Boolean bool9, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Integer num3, Boolean bool10, Boolean bool11, Boolean bool12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Long l, Long l2, Long l3, Long l4, Boolean bool13, Boolean bool14, SpecificEngineConfig.EngineLibrariesValidationStrategy engineLibrariesValidationStrategy, Integer num4, Double d19, Integer num5, OnDeviceEngineCoreConfigResponse onDeviceEngineCoreConfigResponse, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enableEnginePerformanceMonitor = null;
        } else {
            this.enableEnginePerformanceMonitor = bool;
        }
        if ((i & 2) == 0) {
            this.calibrationExpirationTimeMinutes = null;
        } else {
            this.calibrationExpirationTimeMinutes = d;
        }
        if ((i & 4) == 0) {
            this.sessionProgressLogsIntervalSeconds = null;
        } else {
            this.sessionProgressLogsIntervalSeconds = d2;
        }
        if ((i & 8) == 0) {
            this.engineUpdatesBufferSize = null;
        } else {
            this.engineUpdatesBufferSize = num;
        }
        if ((i & 16) == 0) {
            this.enableValidationUploading = null;
        } else {
            this.enableValidationUploading = bool2;
        }
        if ((i & 32) == 0) {
            this.enableRestrictedAreasValidationUploading = null;
        } else {
            this.enableRestrictedAreasValidationUploading = bool3;
        }
        if ((i & 64) == 0) {
            this.enablePositionsUploading = null;
        } else {
            this.enablePositionsUploading = bool4;
        }
        if ((i & 128) == 0) {
            this.enableSensorsDataUploading = null;
        } else {
            this.enableSensorsDataUploading = bool5;
        }
        if ((i & 256) == 0) {
            this.aggressiveMode = null;
        } else {
            this.aggressiveMode = bool6;
        }
        if ((i & 512) == 0) {
            this.enableEventsUploading = null;
        } else {
            this.enableEventsUploading = bool7;
        }
        if ((i & 1024) == 0) {
            this.uploadWriteToFileRecords = null;
        } else {
            this.uploadWriteToFileRecords = num2;
        }
        if ((i & 2048) == 0) {
            this.uploadingMetadataUpdateIntervalSec = null;
        } else {
            this.uploadingMetadataUpdateIntervalSec = d3;
        }
        if ((i & 4096) == 0) {
            this.uploadWriteToFileIntervalSec = null;
        } else {
            this.uploadWriteToFileIntervalSec = d4;
        }
        if ((i & 8192) == 0) {
            this.uploadChunkLengthSeconds = null;
        } else {
            this.uploadChunkLengthSeconds = d5;
        }
        if ((i & 16384) == 0) {
            this.uploadMaxSessionLengthMin = null;
        } else {
            this.uploadMaxSessionLengthMin = d6;
        }
        if ((32768 & i) == 0) {
            this.enableUploadingRecovery = null;
        } else {
            this.enableUploadingRecovery = bool8;
        }
        if ((65536 & i) == 0) {
            this.useDiscretionaryUploading = null;
        } else {
            this.useDiscretionaryUploading = bool9;
        }
        if ((131072 & i) == 0) {
            this.uploadRetryIntervalMinutes = null;
        } else {
            this.uploadRetryIntervalMinutes = d7;
        }
        if ((262144 & i) == 0) {
            this.timeoutIntervalSecForUploadRequest = null;
        } else {
            this.timeoutIntervalSecForUploadRequest = d8;
        }
        if ((524288 & i) == 0) {
            this.metadataSessionTimeoutIntervalForResourceSeconds = null;
        } else {
            this.metadataSessionTimeoutIntervalForResourceSeconds = d9;
        }
        if ((1048576 & i) == 0) {
            this.metadataSessiontimeoutIntervalForRequestSeconds = null;
        } else {
            this.metadataSessiontimeoutIntervalForRequestSeconds = d10;
        }
        if ((2097152 & i) == 0) {
            this.taskRetryDelaySeconds = null;
        } else {
            this.taskRetryDelaySeconds = d11;
        }
        if ((4194304 & i) == 0) {
            this.taskRetryMaxDelaySeconds = null;
        } else {
            this.taskRetryMaxDelaySeconds = d12;
        }
        if ((8388608 & i) == 0) {
            this.celluralAccessAllowanceDelayDays = null;
        } else {
            this.celluralAccessAllowanceDelayDays = num3;
        }
        if ((16777216 & i) == 0) {
            this.isCellularAccessAllowed = null;
        } else {
            this.isCellularAccessAllowed = bool10;
        }
        if ((33554432 & i) == 0) {
            this.isDelayedCellularAccessAllowed = null;
        } else {
            this.isDelayedCellularAccessAllowed = bool11;
        }
        if ((67108864 & i) == 0) {
            this.isConstrainedNetworkAccessAllowed = null;
        } else {
            this.isConstrainedNetworkAccessAllowed = bool12;
        }
        if ((134217728 & i) == 0) {
            this.uploadUrlTimeoutHoursInterval = null;
        } else {
            this.uploadUrlTimeoutHoursInterval = d13;
        }
        if ((268435456 & i) == 0) {
            this.uploadingExpirationTimeDays = null;
        } else {
            this.uploadingExpirationTimeDays = d14;
        }
        if ((536870912 & i) == 0) {
            this.minimumStorageLeftToUploadPositionsMb = null;
        } else {
            this.minimumStorageLeftToUploadPositionsMb = d15;
        }
        if ((1073741824 & i) == 0) {
            this.minimumStorageLeftToUploadSensorsMb = null;
        } else {
            this.minimumStorageLeftToUploadSensorsMb = d16;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.minimumStorageLeftToUploadValidationsMb = null;
        } else {
            this.minimumStorageLeftToUploadValidationsMb = d17;
        }
        if ((i2 & 1) == 0) {
            this.minimumStorageLeftToUploadEventsMb = null;
        } else {
            this.minimumStorageLeftToUploadEventsMb = d18;
        }
        if ((i2 & 2) == 0) {
            this.uploadTaskMaxDelayMin = null;
        } else {
            this.uploadTaskMaxDelayMin = l;
        }
        if ((i2 & 4) == 0) {
            this.controlTaskMaxTimeMin = null;
        } else {
            this.controlTaskMaxTimeMin = l2;
        }
        if ((i2 & 8) == 0) {
            this.controlTaskIntervalMin = null;
        } else {
            this.controlTaskIntervalMin = l3;
        }
        if ((i2 & 16) == 0) {
            this.chargerTaskIntervalMin = null;
        } else {
            this.chargerTaskIntervalMin = l4;
        }
        if ((i2 & 32) == 0) {
            this.uploadingWifiRequired = null;
        } else {
            this.uploadingWifiRequired = bool13;
        }
        if ((i2 & 64) == 0) {
            this.uploadingChargerRequired = null;
        } else {
            this.uploadingChargerRequired = bool14;
        }
        if ((i2 & 128) == 0) {
            this.librariesValidationStrategy = null;
        } else {
            this.librariesValidationStrategy = engineLibrariesValidationStrategy;
        }
        if ((i2 & 256) == 0) {
            this.startReportingRetryCount = null;
        } else {
            this.startReportingRetryCount = num4;
        }
        if ((i2 & 512) == 0) {
            this.startReportingRetryInterval = null;
        } else {
            this.startReportingRetryInterval = d19;
        }
        if ((i2 & 1024) == 0) {
            this.dataLoadingRetryRequestCount = null;
        } else {
            this.dataLoadingRetryRequestCount = num5;
        }
        if ((i2 & 2048) == 0) {
            this.onDeviceCore = null;
        } else {
            this.onDeviceCore = onDeviceEngineCoreConfigResponse;
        }
        if ((i2 & 4096) == 0) {
            this.onDeviceCorePerBuilding = null;
        } else {
            this.onDeviceCorePerBuilding = list;
        }
    }

    public OnDeviceEngineConfigResponse(@Nullable Boolean bool, @Nullable Double d, @Nullable Double d2, @Nullable Integer num, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Integer num2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9, @Nullable Double d10, @Nullable Double d11, @Nullable Double d12, @Nullable Integer num3, @Nullable Boolean bool10, @Nullable Boolean bool11, @Nullable Boolean bool12, @Nullable Double d13, @Nullable Double d14, @Nullable Double d15, @Nullable Double d16, @Nullable Double d17, @Nullable Double d18, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Boolean bool13, @Nullable Boolean bool14, @Nullable SpecificEngineConfig.EngineLibrariesValidationStrategy engineLibrariesValidationStrategy, @Nullable Integer num4, @Nullable Double d19, @Nullable Integer num5, @Nullable OnDeviceEngineCoreConfigResponse onDeviceEngineCoreConfigResponse, @Nullable List<OnDeviceEngineCoreConfigPerBuildingResponse> list) {
        this.enableEnginePerformanceMonitor = bool;
        this.calibrationExpirationTimeMinutes = d;
        this.sessionProgressLogsIntervalSeconds = d2;
        this.engineUpdatesBufferSize = num;
        this.enableValidationUploading = bool2;
        this.enableRestrictedAreasValidationUploading = bool3;
        this.enablePositionsUploading = bool4;
        this.enableSensorsDataUploading = bool5;
        this.aggressiveMode = bool6;
        this.enableEventsUploading = bool7;
        this.uploadWriteToFileRecords = num2;
        this.uploadingMetadataUpdateIntervalSec = d3;
        this.uploadWriteToFileIntervalSec = d4;
        this.uploadChunkLengthSeconds = d5;
        this.uploadMaxSessionLengthMin = d6;
        this.enableUploadingRecovery = bool8;
        this.useDiscretionaryUploading = bool9;
        this.uploadRetryIntervalMinutes = d7;
        this.timeoutIntervalSecForUploadRequest = d8;
        this.metadataSessionTimeoutIntervalForResourceSeconds = d9;
        this.metadataSessiontimeoutIntervalForRequestSeconds = d10;
        this.taskRetryDelaySeconds = d11;
        this.taskRetryMaxDelaySeconds = d12;
        this.celluralAccessAllowanceDelayDays = num3;
        this.isCellularAccessAllowed = bool10;
        this.isDelayedCellularAccessAllowed = bool11;
        this.isConstrainedNetworkAccessAllowed = bool12;
        this.uploadUrlTimeoutHoursInterval = d13;
        this.uploadingExpirationTimeDays = d14;
        this.minimumStorageLeftToUploadPositionsMb = d15;
        this.minimumStorageLeftToUploadSensorsMb = d16;
        this.minimumStorageLeftToUploadValidationsMb = d17;
        this.minimumStorageLeftToUploadEventsMb = d18;
        this.uploadTaskMaxDelayMin = l;
        this.controlTaskMaxTimeMin = l2;
        this.controlTaskIntervalMin = l3;
        this.chargerTaskIntervalMin = l4;
        this.uploadingWifiRequired = bool13;
        this.uploadingChargerRequired = bool14;
        this.librariesValidationStrategy = engineLibrariesValidationStrategy;
        this.startReportingRetryCount = num4;
        this.startReportingRetryInterval = d19;
        this.dataLoadingRetryRequestCount = num5;
        this.onDeviceCore = onDeviceEngineCoreConfigResponse;
        this.onDeviceCorePerBuilding = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OnDeviceEngineConfigResponse(Boolean bool, Double d, Double d2, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num2, Double d3, Double d4, Double d5, Double d6, Boolean bool8, Boolean bool9, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Integer num3, Boolean bool10, Boolean bool11, Boolean bool12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Long l, Long l2, Long l3, Long l4, Boolean bool13, Boolean bool14, SpecificEngineConfig.EngineLibrariesValidationStrategy engineLibrariesValidationStrategy, Integer num4, Double d19, Integer num5, OnDeviceEngineCoreConfigResponse onDeviceEngineCoreConfigResponse, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool15 = (i & 1) != 0 ? null : bool;
        this(bool15, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : bool5, (i & 256) != 0 ? null : bool6, (i & 512) != 0 ? null : bool7, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : d3, (i & 4096) != 0 ? null : d4, (i & 8192) != 0 ? null : d5, (i & 16384) != 0 ? null : d6, (i & 32768) != 0 ? null : bool8, (i & 65536) != 0 ? null : bool9, (i & 131072) != 0 ? null : d7, (i & 262144) != 0 ? null : d8, (i & 524288) != 0 ? null : d9, (i & 1048576) != 0 ? null : d10, (i & 2097152) != 0 ? null : d11, (i & 4194304) != 0 ? null : d12, (i & 8388608) != 0 ? null : num3, (i & 16777216) != 0 ? null : bool10, (i & 33554432) != 0 ? null : bool11, (i & 67108864) != 0 ? null : bool12, (i & 134217728) != 0 ? null : d13, (i & 268435456) != 0 ? null : d14, (i & 536870912) != 0 ? null : d15, (i & 1073741824) != 0 ? null : d16, (i & Integer.MIN_VALUE) != 0 ? null : d17, (i2 & 1) != 0 ? null : d18, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? null : l3, (i2 & 16) != 0 ? null : l4, (i2 & 32) != 0 ? null : bool13, (i2 & 64) != 0 ? null : bool14, (i2 & 128) != 0 ? null : engineLibrariesValidationStrategy, (i2 & 256) != 0 ? null : num4, (i2 & 512) != 0 ? null : d19, (i2 & 1024) != 0 ? null : num5, (i2 & 2048) != 0 ? null : onDeviceEngineCoreConfigResponse, (i2 & 4096) != 0 ? null : list);
    }
}
