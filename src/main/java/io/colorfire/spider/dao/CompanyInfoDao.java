package io.colorfire.spider.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author colorfire on 17/3/27
 */
public class CompanyInfoDao extends BaseDao<CompanyInfo> {

  public void add(CompanyInfo ci) {
    String sql = "INSERT INTO `company_info` (`id`, `name`, `shortName`, `website`, `address`, `logo`, `coordrinate`, " +
            "`fromUrl`, `originalData`) VALUES " +
            "(" + ci.getId() + ", '" + ci.getName() + "', '" + ci.getShortName() + "', '"
            + ci.getWebsite() + "', '" + ci.getAddress() + "', '" + ci.getLogo() + "', '"
            + ci.getCoordinate() + "', '" + ci.getFromUrl() + "', '" + ci.getOriginalData() + "');";
    try {
      stmt.execute(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void addOrUpdate(CompanyInfo ci) {
    String sql = "REPLACE INTO `company_info` (`id`, `name`, `shortName`, `website`, `address`, `logo`, `coordrinate`, " +
            "`fromUrl`, `originalData`, `updateTime`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    PreparedStatement ps = null;
    try {
      ps = conn.prepareStatement(sql);
      ps.setInt(1, ci.getId());
      ps.setString(2, ci.getName());
      ps.setString(3, ci.getShortName());
      ps.setString(4, ci.getWebsite());
      ps.setString(5, ci.getAddress());
      ps.setString(6, ci.getLogo());
      ps.setString(7, ci.getCoordinate());
      ps.setString(8, ci.getFromUrl());
      ps.setString(9, ci.getOriginalData());
      ps.setString(10, ci.getUpdateTime());
      ps.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public CompanyInfo get(int id) {
    String sql = "SELECT `id`, `name`, `shortName`, `website`, `address`, `logo`, `coordrinate`, " +
            "`fromUrl`, `originalData` FROM `company_info` WHERE id = " + id + ";";
    ResultSet rs = null;
    CompanyInfo ci = new CompanyInfo();
    ci.setId(id);
    try {
      rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while (rs.next()) {
        //Retrieve by column name
        ci.setName(rs.getString("name"));
        ci.setShortName(rs.getString("shortName"));
        ci.setWebsite(rs.getString("website"));
        ci.setAddress(rs.getString("address"));
        ci.setLogo(rs.getString("logo"));
        ci.setCoordinate(rs.getString("coordrinate"));
        ci.setFromUrl(rs.getString("fromUrl"));
        ci.setOriginalData(rs.getString("originalData"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (rs != null)
          rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return ci;
  }


  public void del(int id) {
    String sql = "DELETE * FROM `company_info` WHERE ID = " + id;
    try {
      stmt.execute(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
