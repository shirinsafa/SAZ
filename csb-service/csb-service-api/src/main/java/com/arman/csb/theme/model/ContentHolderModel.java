package com.arman.csb.theme.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ContentHolder service. Represents a row in the &quot;CSB_ContentHolder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arman.csb.theme.model.impl.ContentHolderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arman.csb.theme.model.impl.ContentHolderImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContentHolder
 * @see com.arman.csb.theme.model.impl.ContentHolderImpl
 * @see com.arman.csb.theme.model.impl.ContentHolderModelImpl
 * @generated
 */
public interface ContentHolderModel extends BaseModel<ContentHolder>,
    StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a content holder model instance should use the {@link ContentHolder} interface instead.
     */

    /**
     * Returns the primary key of this content holder.
     *
     * @return the primary key of this content holder
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this content holder.
     *
     * @param primaryKey the primary key of this content holder
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this content holder.
     *
     * @return the uuid of this content holder
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this content holder.
     *
     * @param uuid the uuid of this content holder
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the ID of this content holder.
     *
     * @return the ID of this content holder
     */
    public long getId();

    /**
     * Sets the ID of this content holder.
     *
     * @param id the ID of this content holder
     */
    public void setId(long id);

    /**
     * Returns the group ID of this content holder.
     *
     * @return the group ID of this content holder
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this content holder.
     *
     * @param groupId the group ID of this content holder
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this content holder.
     *
     * @return the company ID of this content holder
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this content holder.
     *
     * @param companyId the company ID of this content holder
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this content holder.
     *
     * @return the user ID of this content holder
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this content holder.
     *
     * @param userId the user ID of this content holder
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this content holder.
     *
     * @return the user uuid of this content holder
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this content holder.
     *
     * @param userUuid the user uuid of this content holder
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this content holder.
     *
     * @return the user name of this content holder
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this content holder.
     *
     * @param userName the user name of this content holder
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this content holder.
     *
     * @return the create date of this content holder
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this content holder.
     *
     * @param createDate the create date of this content holder
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this content holder.
     *
     * @return the modified date of this content holder
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this content holder.
     *
     * @param modifiedDate the modified date of this content holder
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the name of this content holder.
     *
     * @return the name of this content holder
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this content holder.
     *
     * @param name the name of this content holder
     */
    public void setName(String name);

    /**
     * Returns the head of this content holder.
     *
     * @return the head of this content holder
     */
    @AutoEscape
    public String getHead();

    /**
     * Sets the head of this content holder.
     *
     * @param head the head of this content holder
     */
    public void setHead(String head);

    /**
     * Returns the bottom of this content holder.
     *
     * @return the bottom of this content holder
     */
    @AutoEscape
    public String getBottom();

    /**
     * Sets the bottom of this content holder.
     *
     * @param bottom the bottom of this content holder
     */
    public void setBottom(String bottom);

    /**
     * Returns the html content of this content holder.
     *
     * @return the html content of this content holder
     */
    @AutoEscape
    public String getHtmlContent();

    /**
     * Sets the html content of this content holder.
     *
     * @param htmlContent the html content of this content holder
     */
    public void setHtmlContent(String htmlContent);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(ContentHolder contentHolder);

    @Override
    public int hashCode();

    @Override
    public CacheModel<ContentHolder> toCacheModel();

    @Override
    public ContentHolder toEscapedModel();

    @Override
    public ContentHolder toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}