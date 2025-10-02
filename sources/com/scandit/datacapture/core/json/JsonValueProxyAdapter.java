package com.scandit.datacapture.core.json;

import com.salesforce.marketingcloud.storage.db.i;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010J\u001a\u00020\u0002\u0012\b\b\u0002\u0010?\u001a\u00020:¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010%\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\"H\u0016J\b\u0010'\u001a\u00020&H\u0016J\u0010\u0010(\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010)\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u0010\u0010,\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u001c\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020\fH\u0016J\b\u00100\u001a\u00020*H\u0016J\u0010\u00101\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u001c\u00102\u001a\u0004\u0018\u00010*2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010*H\u0016J\u0011\u00103\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0096\u0002J\u0010\u00104\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0016\u00108\u001a\u0002072\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000405H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u000405H\u0016R\u001a\u0010?\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lcom/scandit/datacapture/core/json/JsonValueProxyAdapter;", "Lcom/scandit/datacapture/core/json/JsonValueProxy;", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "_impl", "", "jsonString", "", "asBoolean", "key", "requireByKeyAsBoolean", "defaultValue", "getByKeyAsBoolean", "", "asInt", "requireByKeyAsInt", "getByKeyAsInt", "", "asFloat", "requireByKeyAsFloat", "getByKeyAsFloat", "asString", "requireByKeyAsString", "getByKeyAsString", "asColor", "requireByKeyAsColor", "getByKeyAsColor", "Lcom/scandit/datacapture/core/ui/style/Brush;", "asBrush", "requireByKeyAsBrush", "getByKeyAsBrush", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "asFloatWithUnit", "requireByKeyAsFloatWithUnit", "getByKeyAsFloatWithUnit", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "asPointWithUnit", "requireByKeyAsPointWithUnit", "getByKeyAsPointWithUnit", "Lcom/scandit/datacapture/core/common/geometry/MarginsWithUnit;", "asMarginsWithUnit", "requireByKeyAsMarginsWithUnit", "getByKeyAsMarginsWithUnit", "Lcom/scandit/datacapture/core/json/JsonValue;", "asArray", "requireByKeyAsArray", "getByKeyAsArray", "index", "requireByIndex", "asObject", "requireByKeyAsObject", "getByKeyAsObject", "contains", "requireByKey", "Ljava/util/ArrayList;", i.a.n, "", "_removeKeys", "_getWarnings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "getSize", "()J", "size", "getAbsolutePath", "()Ljava/lang/String;", "absolutePath", "getUsed", "()Z", "used", "_NativeJsonValue", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class JsonValueProxyAdapter implements JsonValueProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeJsonValue f18778a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public JsonValueProxyAdapter(@NotNull NativeJsonValue _NativeJsonValue, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeJsonValue, "_NativeJsonValue");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18778a = _NativeJsonValue;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public ArrayList<String> _getWarnings() {
        ArrayList<String> _0 = this.f18778a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeJsonValue getF18778a() {
        return this.f18778a;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public void _removeKeys(@NotNull ArrayList<String> keys) {
        Intrinsics.h(keys, "keys");
        this.f18778a.removeKeys(keys);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public JsonValue asArray() {
        NativeJsonValue _0 = this.f18778a.asArray();
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeJsonValue.class);
        Intrinsics.g(_0, "_0");
        return (JsonValue) proxyCache.getOrPut(kClassB, null, _0, new a(_0));
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public boolean asBoolean() {
        return this.f18778a.asBool();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public Brush asBrush() {
        NativeBrush _0 = this.f18778a.asBrush();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public int asColor() {
        NativeColor _0 = this.f18778a.asColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public float asFloat() {
        return this.f18778a.asFloat();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public FloatWithUnit asFloatWithUnit() {
        FloatWithUnit _0 = this.f18778a.asFloatWithUnit();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public int asInt() {
        return this.f18778a.asInt();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public MarginsWithUnit asMarginsWithUnit() {
        MarginsWithUnit _0 = this.f18778a.asMarginsWithUnit();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public JsonValue asObject() {
        NativeJsonValue _0 = this.f18778a.asObject();
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeJsonValue.class);
        Intrinsics.g(_0, "_0");
        return (JsonValue) proxyCache.getOrPut(kClassB, null, _0, new b(_0));
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public PointWithUnit asPointWithUnit() {
        PointWithUnit _0 = this.f18778a.asPointWithUnit();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public String asString() {
        String _0 = this.f18778a.asString();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public boolean contains(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18778a.contains(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public String getAbsolutePath() {
        String _0 = this.f18778a.getAbsolutePath();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @Nullable
    public JsonValue getByKeyAsArray(@NotNull String key, @Nullable JsonValue defaultValue) {
        NativeJsonValue f18778a;
        Intrinsics.h(key, "key");
        if (defaultValue != null) {
            f18778a = defaultValue.getF18778a();
            this.proxyCache.put(Reflection.f24268a.b(NativeJsonValue.class), null, f18778a, defaultValue);
        } else {
            f18778a = null;
        }
        NativeJsonValue arrayForKeyOrDefault = this.f18778a.getArrayForKeyOrDefault(key, f18778a);
        if (arrayForKeyOrDefault != null) {
            return (JsonValue) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeJsonValue.class), null, arrayForKeyOrDefault, new c(arrayForKeyOrDefault));
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public boolean getByKeyAsBoolean(@NotNull String key, boolean defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18778a.getBoolForKeyOrDefault(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public Brush getByKeyAsBrush(@NotNull String key, @NotNull Brush defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeBrush _1 = this.f18778a.getBrushForKeyOrDefault(key, coreNativeTypeFactory.convert(defaultValue));
        Intrinsics.g(_1, "_1");
        return coreNativeTypeFactory.convert(_1);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public int getByKeyAsColor(@NotNull String key, int defaultValue) {
        Intrinsics.h(key, "key");
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeColor _1 = this.f18778a.getColorForKeyOrDefault(key, coreNativeTypeFactory.convert(defaultValue));
        Intrinsics.g(_1, "_1");
        return coreNativeTypeFactory.convert(_1);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public float getByKeyAsFloat(@NotNull String key, float defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18778a.getFloatForKeyOrDefault(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public FloatWithUnit getByKeyAsFloatWithUnit(@NotNull String key, @NotNull FloatWithUnit defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        FloatWithUnit _0 = this.f18778a.getFloatWithUnitForKeyOrDefault(key, defaultValue);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public int getByKeyAsInt(@NotNull String key, int defaultValue) {
        Intrinsics.h(key, "key");
        return this.f18778a.getIntForKeyOrDefault(key, defaultValue);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public MarginsWithUnit getByKeyAsMarginsWithUnit(@NotNull String key, @NotNull MarginsWithUnit defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        MarginsWithUnit _0 = this.f18778a.getMarginsWithUnitForKeyOrDefault(key, defaultValue);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @Nullable
    public JsonValue getByKeyAsObject(@NotNull String key, @Nullable JsonValue defaultValue) {
        NativeJsonValue f18778a;
        Intrinsics.h(key, "key");
        if (defaultValue != null) {
            f18778a = defaultValue.getF18778a();
            this.proxyCache.put(Reflection.f24268a.b(NativeJsonValue.class), null, f18778a, defaultValue);
        } else {
            f18778a = null;
        }
        NativeJsonValue objectForKeyOrDefault = this.f18778a.getObjectForKeyOrDefault(key, f18778a);
        if (objectForKeyOrDefault != null) {
            return (JsonValue) this.proxyCache.getOrPut(Reflection.f24268a.b(NativeJsonValue.class), null, objectForKeyOrDefault, new d(objectForKeyOrDefault));
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public PointWithUnit getByKeyAsPointWithUnit(@NotNull String key, @NotNull PointWithUnit defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        PointWithUnit _0 = this.f18778a.getPointWithUnitForKeyOrDefault(key, defaultValue);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public String getByKeyAsString(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultValue, "defaultValue");
        String _0 = this.f18778a.getStringForKeyOrDefault(key, defaultValue);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public long getSize() {
        return this.f18778a.size();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public boolean getUsed() {
        return this.f18778a.isUsed();
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public String jsonString() {
        String string = this.f18778a.toString();
        Intrinsics.g(string, "_NativeJsonValue.toString()");
        return string;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public JsonValue requireByIndex(int index) {
        NativeJsonValue _0 = this.f18778a.getForIndex(index);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeJsonValue.class);
        Intrinsics.g(_0, "_0");
        return (JsonValue) proxyCache.getOrPut(kClassB, null, _0, new e(_0));
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public JsonValue requireByKey(@NotNull String key) {
        Intrinsics.h(key, "key");
        NativeJsonValue _0 = this.f18778a.getForKey(key);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeJsonValue.class);
        Intrinsics.g(_0, "_0");
        return (JsonValue) proxyCache.getOrPut(kClassB, null, _0, new f(_0));
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public JsonValue requireByKeyAsArray(@NotNull String key) {
        Intrinsics.h(key, "key");
        NativeJsonValue _0 = this.f18778a.getArrayForKey(key);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeJsonValue.class);
        Intrinsics.g(_0, "_0");
        return (JsonValue) proxyCache.getOrPut(kClassB, null, _0, new g(_0));
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public boolean requireByKeyAsBoolean(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18778a.getBoolForKey(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public Brush requireByKeyAsBrush(@NotNull String key) {
        Intrinsics.h(key, "key");
        NativeBrush _0 = this.f18778a.getBrushForKey(key);
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public int requireByKeyAsColor(@NotNull String key) {
        Intrinsics.h(key, "key");
        NativeColor _0 = this.f18778a.getColorForKey(key);
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(_0, "_0");
        return coreNativeTypeFactory.convert(_0);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public float requireByKeyAsFloat(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18778a.getFloatForKey(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public FloatWithUnit requireByKeyAsFloatWithUnit(@NotNull String key) {
        Intrinsics.h(key, "key");
        FloatWithUnit _0 = this.f18778a.getFloatWithUnitForKey(key);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    public int requireByKeyAsInt(@NotNull String key) {
        Intrinsics.h(key, "key");
        return this.f18778a.getIntForKey(key);
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public MarginsWithUnit requireByKeyAsMarginsWithUnit(@NotNull String key) {
        Intrinsics.h(key, "key");
        MarginsWithUnit _0 = this.f18778a.getMarginsWithUnitForKey(key);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public JsonValue requireByKeyAsObject(@NotNull String key) {
        Intrinsics.h(key, "key");
        NativeJsonValue _0 = this.f18778a.getObjectForKey(key);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeJsonValue.class);
        Intrinsics.g(_0, "_0");
        return (JsonValue) proxyCache.getOrPut(kClassB, null, _0, new h(_0));
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public PointWithUnit requireByKeyAsPointWithUnit(@NotNull String key) {
        Intrinsics.h(key, "key");
        PointWithUnit _0 = this.f18778a.getPointWithUnitForKey(key);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.json.JsonValueProxy
    @NotNull
    public String requireByKeyAsString(@NotNull String key) {
        Intrinsics.h(key, "key");
        String _0 = this.f18778a.getStringForKey(key);
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ JsonValueProxyAdapter(NativeJsonValue nativeJsonValue, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeJsonValue, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
