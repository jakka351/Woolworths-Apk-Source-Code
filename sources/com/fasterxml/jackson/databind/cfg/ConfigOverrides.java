package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class ConfigOverrides implements Serializable {
    public JsonInclude.Value d;
    public JsonSetter.Value e;
    public VisibilityChecker.Std f;
}
