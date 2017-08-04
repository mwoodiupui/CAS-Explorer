/*
 * Copyright 2017 Indiana University.  All rights reserved.
 *
 * Mark H. Wood, IUPUI University Library, Jul 20, 2017
 */

package edu.iupui.ulib.cas.explorer;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author mwood
 */
@Named
@RequestScoped
public class UtilityBean
{
    private static final Logger LOG = Logger.getLogger(UtilityBean.class.getName());

    public String getTest()
    {
        LOG.warning("LOG Entering getTest");
        return "pass";
    }

    public List getRequestAttributeNames(HttpServletRequest request)
    {
        LOG.warning("Entering getRequestAttributeNames");
        return Collections.list(request.getAttributeNames());
    }
}
