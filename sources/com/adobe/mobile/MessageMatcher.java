package com.adobe.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
abstract class MessageMatcher {
    public static final Map c;

    /* renamed from: a, reason: collision with root package name */
    public String f13271a;
    public ArrayList b;

    /* renamed from: com.adobe.mobile.MessageMatcher$1, reason: invalid class name */
    public static class AnonymousClass1 extends HashMap<String, Class> {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("eq", MessageMatcherEquals.class);
        anonymousClass1.put("ne", MessageMatcherNotEquals.class);
        anonymousClass1.put("gt", MessageMatcherGreaterThan.class);
        anonymousClass1.put("ge", MessageMatcherGreaterThanOrEqual.class);
        anonymousClass1.put("lt", MessageMatcherLessThan.class);
        anonymousClass1.put("le", MessageMatcherLessThanOrEqual.class);
        anonymousClass1.put("co", MessageMatcherContains.class);
        anonymousClass1.put("nc", MessageMatcherNotContains.class);
        anonymousClass1.put("sw", MessageMatcherStartsWith.class);
        anonymousClass1.put("ew", MessageMatcherEndsWith.class);
        anonymousClass1.put("ex", MessageMatcherExists.class);
        anonymousClass1.put("nx", MessageMatcherNotExists.class);
        c = anonymousClass1;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.adobe.mobile.MessageMatcher c(org.json.JSONObject r6) throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        /*
            java.lang.String r0 = "Messages - error creating matcher, key is required"
            java.lang.String r1 = "Messages - Error creating matcher (%s)"
            r2 = 0
            java.lang.String r3 = "matches"
            java.lang.String r3 = r6.getString(r3)     // Catch: org.json.JSONException -> L1b
            if (r3 == 0) goto L24
            int r4 = r3.length()     // Catch: org.json.JSONException -> L1b
            if (r4 > 0) goto L24
            java.lang.String r4 = "Messages - message matcher type is empty"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: org.json.JSONException -> L1b
            com.adobe.mobile.StaticMethods.K(r4, r5)     // Catch: org.json.JSONException -> L1b
            goto L24
        L1b:
            java.lang.String r3 = "Messages - message matcher type is required"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.adobe.mobile.StaticMethods.K(r3, r4)
            java.lang.String r3 = "UNKNOWN"
        L24:
            java.util.Map r4 = com.adobe.mobile.MessageMatcher.c
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 != 0) goto L3b
            java.lang.String r4 = "Messages - message matcher type \"%s\" is invalid"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.adobe.mobile.StaticMethods.K(r4, r3)
            java.lang.Class<com.adobe.mobile.MessageMatcherUnknown> r4 = com.adobe.mobile.MessageMatcherUnknown.class
        L3b:
            java.lang.Object r3 = r4.newInstance()     // Catch: java.lang.IllegalAccessException -> L42 java.lang.InstantiationException -> L44
            com.adobe.mobile.MessageMatcher r3 = (com.adobe.mobile.MessageMatcher) r3     // Catch: java.lang.IllegalAccessException -> L42 java.lang.InstantiationException -> L44
            goto L5e
        L42:
            r3 = move-exception
            goto L46
        L44:
            r3 = move-exception
            goto L52
        L46:
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.adobe.mobile.StaticMethods.J(r1, r3)
            goto L5d
        L52:
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.adobe.mobile.StaticMethods.J(r1, r3)
        L5d:
            r3 = 0
        L5e:
            if (r3 == 0) goto Lc3
            java.lang.String r1 = "key"
            java.lang.String r1 = r6.getString(r1)     // Catch: java.lang.NullPointerException -> L7c org.json.JSONException -> L82
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.NullPointerException -> L7c org.json.JSONException -> L82
            r3.f13271a = r1     // Catch: java.lang.NullPointerException -> L7c org.json.JSONException -> L82
            if (r1 == 0) goto L87
            int r1 = r1.length()     // Catch: java.lang.NullPointerException -> L7c org.json.JSONException -> L82
            if (r1 > 0) goto L87
            java.lang.String r1 = "Messages - error creating matcher, key is empty"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.NullPointerException -> L7c org.json.JSONException -> L82
            com.adobe.mobile.StaticMethods.K(r1, r4)     // Catch: java.lang.NullPointerException -> L7c org.json.JSONException -> L82
            goto L87
        L7c:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.adobe.mobile.StaticMethods.K(r0, r1)
            goto L87
        L82:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.adobe.mobile.StaticMethods.K(r0, r1)
        L87:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: org.json.JSONException -> Lbc
            r0.<init>()     // Catch: org.json.JSONException -> Lbc
            r3.b = r0     // Catch: org.json.JSONException -> Lbc
            boolean r0 = r3 instanceof com.adobe.mobile.MessageMatcherExists     // Catch: org.json.JSONException -> Lbc
            if (r0 == 0) goto L93
            return r3
        L93:
            java.lang.String r0 = "values"
            org.json.JSONArray r6 = r6.getJSONArray(r0)     // Catch: org.json.JSONException -> Lbc
            int r0 = r6.length()     // Catch: org.json.JSONException -> Lbc
            r1 = r2
        L9e:
            if (r1 >= r0) goto Lac
            java.util.ArrayList r4 = r3.b     // Catch: org.json.JSONException -> Lbc
            java.lang.Object r5 = r6.get(r1)     // Catch: org.json.JSONException -> Lbc
            r4.add(r5)     // Catch: org.json.JSONException -> Lbc
            int r1 = r1 + 1
            goto L9e
        Lac:
            java.util.ArrayList r6 = r3.b     // Catch: org.json.JSONException -> Lbc
            int r6 = r6.size()     // Catch: org.json.JSONException -> Lbc
            if (r6 != 0) goto Lc3
            java.lang.String r6 = "Messages - error creating matcher, values is empty"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: org.json.JSONException -> Lbc
            com.adobe.mobile.StaticMethods.K(r6, r0)     // Catch: org.json.JSONException -> Lbc
            goto Lc3
        Lbc:
            java.lang.String r6 = "Messages - error creating matcher, values is required"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.adobe.mobile.StaticMethods.K(r6, r0)
        Lc3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.MessageMatcher.c(org.json.JSONObject):com.adobe.mobile.MessageMatcher");
    }

    public static Double d(Object obj) {
        try {
            return Double.valueOf(obj.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean a(Object obj) {
        return false;
    }

    public boolean b(Map... mapArr) {
        Object obj;
        if (mapArr.length > 0) {
            int length = mapArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                Map map = mapArr[i];
                if (map != null && map.containsKey(this.f13271a)) {
                    obj = map.get(this.f13271a);
                    break;
                }
                i++;
            }
            if (obj != null && a(obj)) {
                return true;
            }
        }
        return false;
    }
}
