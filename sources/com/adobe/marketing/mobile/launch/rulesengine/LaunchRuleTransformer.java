package com.adobe.marketing.mobile.launch.rulesengine;

import com.adobe.marketing.mobile.internal.util.UrlEncoder;
import com.adobe.marketing.mobile.rulesengine.Transformer;
import com.adobe.marketing.mobile.rulesengine.TransformerBlock;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRuleTransformer;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LaunchRuleTransformer {
    public static Transformer a() {
        Transformer transformer = new Transformer();
        HashMap map = new HashMap();
        transformer.f13227a = map;
        final int i = 4;
        map.put("urlenc", new TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.a
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final Object a(Object obj) {
                switch (i) {
                    case 0:
                        if (!(obj instanceof String)) {
                            return obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj;
                        }
                        Integer numI0 = StringsKt.i0((String) obj);
                        return numI0 == null ? obj : numI0;
                    case 1:
                        if (obj != null) {
                            return obj.toString();
                        }
                        return null;
                    case 2:
                        if (obj instanceof String) {
                            Double dH0 = StringsKt.h0((String) obj);
                            return dH0 == null ? obj : dH0;
                        }
                        if (obj instanceof Number) {
                            return Double.valueOf(((Number) obj).doubleValue());
                        }
                        if (obj instanceof Boolean) {
                            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
                        }
                        return obj;
                    case 3:
                        if (obj instanceof String) {
                            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
                        }
                        if (!(obj instanceof Number)) {
                            return obj;
                        }
                        Number number = (Number) obj;
                        return Boolean.valueOf(number.longValue() == 1 && number.doubleValue() == 1.0d);
                    default:
                        return obj instanceof String ? UrlEncoder.a((String) obj) : obj;
                }
            }
        });
        final int i2 = 0;
        map.put("int", new TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.a
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final Object a(Object obj) {
                switch (i2) {
                    case 0:
                        if (!(obj instanceof String)) {
                            return obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj;
                        }
                        Integer numI0 = StringsKt.i0((String) obj);
                        return numI0 == null ? obj : numI0;
                    case 1:
                        if (obj != null) {
                            return obj.toString();
                        }
                        return null;
                    case 2:
                        if (obj instanceof String) {
                            Double dH0 = StringsKt.h0((String) obj);
                            return dH0 == null ? obj : dH0;
                        }
                        if (obj instanceof Number) {
                            return Double.valueOf(((Number) obj).doubleValue());
                        }
                        if (obj instanceof Boolean) {
                            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
                        }
                        return obj;
                    case 3:
                        if (obj instanceof String) {
                            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
                        }
                        if (!(obj instanceof Number)) {
                            return obj;
                        }
                        Number number = (Number) obj;
                        return Boolean.valueOf(number.longValue() == 1 && number.doubleValue() == 1.0d);
                    default:
                        return obj instanceof String ? UrlEncoder.a((String) obj) : obj;
                }
            }
        });
        final int i3 = 1;
        map.put("string", new TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.a
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final Object a(Object obj) {
                switch (i3) {
                    case 0:
                        if (!(obj instanceof String)) {
                            return obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj;
                        }
                        Integer numI0 = StringsKt.i0((String) obj);
                        return numI0 == null ? obj : numI0;
                    case 1:
                        if (obj != null) {
                            return obj.toString();
                        }
                        return null;
                    case 2:
                        if (obj instanceof String) {
                            Double dH0 = StringsKt.h0((String) obj);
                            return dH0 == null ? obj : dH0;
                        }
                        if (obj instanceof Number) {
                            return Double.valueOf(((Number) obj).doubleValue());
                        }
                        if (obj instanceof Boolean) {
                            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
                        }
                        return obj;
                    case 3:
                        if (obj instanceof String) {
                            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
                        }
                        if (!(obj instanceof Number)) {
                            return obj;
                        }
                        Number number = (Number) obj;
                        return Boolean.valueOf(number.longValue() == 1 && number.doubleValue() == 1.0d);
                    default:
                        return obj instanceof String ? UrlEncoder.a((String) obj) : obj;
                }
            }
        });
        final int i4 = 2;
        map.put("double", new TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.a
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final Object a(Object obj) {
                switch (i4) {
                    case 0:
                        if (!(obj instanceof String)) {
                            return obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj;
                        }
                        Integer numI0 = StringsKt.i0((String) obj);
                        return numI0 == null ? obj : numI0;
                    case 1:
                        if (obj != null) {
                            return obj.toString();
                        }
                        return null;
                    case 2:
                        if (obj instanceof String) {
                            Double dH0 = StringsKt.h0((String) obj);
                            return dH0 == null ? obj : dH0;
                        }
                        if (obj instanceof Number) {
                            return Double.valueOf(((Number) obj).doubleValue());
                        }
                        if (obj instanceof Boolean) {
                            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
                        }
                        return obj;
                    case 3:
                        if (obj instanceof String) {
                            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
                        }
                        if (!(obj instanceof Number)) {
                            return obj;
                        }
                        Number number = (Number) obj;
                        return Boolean.valueOf(number.longValue() == 1 && number.doubleValue() == 1.0d);
                    default:
                        return obj instanceof String ? UrlEncoder.a((String) obj) : obj;
                }
            }
        });
        final int i5 = 3;
        map.put("bool", new TransformerBlock() { // from class: com.adobe.marketing.mobile.launch.rulesengine.a
            @Override // com.adobe.marketing.mobile.rulesengine.TransformerBlock
            public final Object a(Object obj) {
                switch (i5) {
                    case 0:
                        if (!(obj instanceof String)) {
                            return obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj;
                        }
                        Integer numI0 = StringsKt.i0((String) obj);
                        return numI0 == null ? obj : numI0;
                    case 1:
                        if (obj != null) {
                            return obj.toString();
                        }
                        return null;
                    case 2:
                        if (obj instanceof String) {
                            Double dH0 = StringsKt.h0((String) obj);
                            return dH0 == null ? obj : dH0;
                        }
                        if (obj instanceof Number) {
                            return Double.valueOf(((Number) obj).doubleValue());
                        }
                        if (obj instanceof Boolean) {
                            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
                        }
                        return obj;
                    case 3:
                        if (obj instanceof String) {
                            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
                        }
                        if (!(obj instanceof Number)) {
                            return obj;
                        }
                        Number number = (Number) obj;
                        return Boolean.valueOf(number.longValue() == 1 && number.doubleValue() == 1.0d);
                    default:
                        return obj instanceof String ? UrlEncoder.a((String) obj) : obj;
                }
            }
        });
        return transformer;
    }
}
