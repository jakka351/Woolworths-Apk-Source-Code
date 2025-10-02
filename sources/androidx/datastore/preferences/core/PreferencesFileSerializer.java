package androidx.datastore.preferences.core;

import androidx.constraintlayout.core.state.a;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesFileSerializer;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PreferencesFileSerializer implements Serializer<Preferences> {

    /* renamed from: a, reason: collision with root package name */
    public static final PreferencesFileSerializer f2590a = new PreferencesFileSerializer();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2591a;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f2591a = iArr;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return PreferencesFactory.a();
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream input, Continuation continuation) throws CorruptionException {
        Intrinsics.h(input, "input");
        try {
            PreferencesProto.PreferenceMap preferenceMapW = PreferencesProto.PreferenceMap.w(input);
            Preferences.Pair[] pairArr = new Preferences.Pair[0];
            MutablePreferences mutablePreferences = new MutablePreferences(false);
            Preferences.Pair[] pairs = (Preferences.Pair[]) Arrays.copyOf(pairArr, pairArr.length);
            Intrinsics.h(pairs, "pairs");
            mutablePreferences.c();
            if (pairs.length > 0) {
                pairs[0].getClass();
                mutablePreferences.f(null, null);
                throw null;
            }
            Map mapU = preferenceMapW.u();
            Intrinsics.g(mapU, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapU.entrySet()) {
                String name = (String) entry.getKey();
                PreferencesProto.Value value = (PreferencesProto.Value) entry.getValue();
                Intrinsics.g(name, "name");
                Intrinsics.g(value, "value");
                PreferencesProto.Value.ValueCase valueCaseK = value.K();
                switch (valueCaseK == null ? -1 : WhenMappings.f2591a[valueCaseK.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        mutablePreferences.f(PreferencesKeys.a(name), Boolean.valueOf(value.B()));
                        break;
                    case 2:
                        mutablePreferences.f(new Preferences.Key(name), Float.valueOf(value.F()));
                        break;
                    case 3:
                        mutablePreferences.f(new Preferences.Key(name), Double.valueOf(value.E()));
                        break;
                    case 4:
                        mutablePreferences.f(new Preferences.Key(name), Integer.valueOf(value.G()));
                        break;
                    case 5:
                        mutablePreferences.f(PreferencesKeys.b(name), Long.valueOf(value.H()));
                        break;
                    case 6:
                        Preferences.Key keyC = PreferencesKeys.c(name);
                        String strI = value.I();
                        Intrinsics.g(strI, "value.string");
                        mutablePreferences.f(keyC, strI);
                        break;
                    case 7:
                        Preferences.Key keyD = PreferencesKeys.d(name);
                        Internal.ProtobufList protobufListV = value.J().v();
                        Intrinsics.g(protobufListV, "value.stringSet.stringsList");
                        mutablePreferences.f(keyD, CollectionsKt.L0(protobufListV));
                        break;
                    case 8:
                        Preferences.Key key = new Preferences.Key(name);
                        byte[] bArrU = value.C().u();
                        Intrinsics.g(bArrU, "value.bytes.toByteArray()");
                        mutablePreferences.f(key, bArrU);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new MutablePreferences(MapsKt.s(mutablePreferences.a()), true);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        GeneratedMessageLite generatedMessageLiteD;
        Map mapA = ((Preferences) obj).a();
        PreferencesProto.PreferenceMap.Builder builderV = PreferencesProto.PreferenceMap.v();
        for (Map.Entry entry : mapA.entrySet()) {
            Preferences.Key key = (Preferences.Key) entry.getKey();
            Object value = entry.getValue();
            String str = key.f2589a;
            if (value instanceof Boolean) {
                PreferencesProto.Value.Builder builderL = PreferencesProto.Value.L();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                builderL.f();
                PreferencesProto.Value.y((PreferencesProto.Value) builderL.e, zBooleanValue);
                generatedMessageLiteD = builderL.d();
            } else if (value instanceof Float) {
                PreferencesProto.Value.Builder builderL2 = PreferencesProto.Value.L();
                float fFloatValue = ((Number) value).floatValue();
                builderL2.f();
                PreferencesProto.Value.z((PreferencesProto.Value) builderL2.e, fFloatValue);
                generatedMessageLiteD = builderL2.d();
            } else if (value instanceof Double) {
                PreferencesProto.Value.Builder builderL3 = PreferencesProto.Value.L();
                double dDoubleValue = ((Number) value).doubleValue();
                builderL3.f();
                PreferencesProto.Value.w((PreferencesProto.Value) builderL3.e, dDoubleValue);
                generatedMessageLiteD = builderL3.d();
            } else if (value instanceof Integer) {
                PreferencesProto.Value.Builder builderL4 = PreferencesProto.Value.L();
                int iIntValue = ((Number) value).intValue();
                builderL4.f();
                PreferencesProto.Value.A((PreferencesProto.Value) builderL4.e, iIntValue);
                generatedMessageLiteD = builderL4.d();
            } else if (value instanceof Long) {
                PreferencesProto.Value.Builder builderL5 = PreferencesProto.Value.L();
                long jLongValue = ((Number) value).longValue();
                builderL5.f();
                PreferencesProto.Value.t((PreferencesProto.Value) builderL5.e, jLongValue);
                generatedMessageLiteD = builderL5.d();
            } else if (value instanceof String) {
                PreferencesProto.Value.Builder builderL6 = PreferencesProto.Value.L();
                builderL6.f();
                PreferencesProto.Value.u((PreferencesProto.Value) builderL6.e, (String) value);
                generatedMessageLiteD = builderL6.d();
            } else if (value instanceof Set) {
                PreferencesProto.Value.Builder builderL7 = PreferencesProto.Value.L();
                PreferencesProto.StringSet.Builder builderW = PreferencesProto.StringSet.w();
                builderW.f();
                PreferencesProto.StringSet.t((PreferencesProto.StringSet) builderW.e, (Set) value);
                builderL7.f();
                PreferencesProto.Value.v((PreferencesProto.Value) builderL7.e, (PreferencesProto.StringSet) builderW.d());
                generatedMessageLiteD = builderL7.d();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException(a.g(value, "PreferencesSerializer does not support type: "));
                }
                PreferencesProto.Value.Builder builderL8 = PreferencesProto.Value.L();
                byte[] bArr = (byte[]) value;
                ByteString byteStringI = ByteString.i(0, bArr.length, bArr);
                builderL8.f();
                PreferencesProto.Value.x((PreferencesProto.Value) builderL8.e, byteStringI);
                generatedMessageLiteD = builderL8.d();
            }
            builderV.getClass();
            str.getClass();
            builderV.f();
            PreferencesProto.PreferenceMap.t((PreferencesProto.PreferenceMap) builderV.e).put(str, (PreferencesProto.Value) generatedMessageLiteD);
        }
        ((PreferencesProto.PreferenceMap) builderV.d()).g(outputStream);
        return Unit.f24250a;
    }
}
