package com.microsoft.alm.java.git_credential_helper.helpers;

import java.util.Iterator;

public class IteratorExtensions
{
    public static <T> T firstOrDefault(final Iterator<T> iterator)
    {
        if (iterator.hasNext())
        {
            return iterator.next();
        }
        else
        {
            return null;
        }
    }
}
