<?php
namespace Airavata\Model\AppCatalog\AppDeployment;

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


class SetEnvPaths {
  static $_TSPEC;

  public $name = null;
  public $value = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'name',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'value',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['name'])) {
        $this->name = $vals['name'];
      }
      if (isset($vals['value'])) {
        $this->value = $vals['value'];
      }
    }
  }

  public function getName() {
    return 'SetEnvPaths';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->name);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->value);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('SetEnvPaths');
    if ($this->name !== null) {
      $xfer += $output->writeFieldBegin('name', TType::STRING, 1);
      $xfer += $output->writeString($this->name);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->value !== null) {
      $xfer += $output->writeFieldBegin('value', TType::STRING, 2);
      $xfer += $output->writeString($this->value);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class ApplicationModule {
  static $_TSPEC;

  public $isEmpty = false;
  public $appModuleId = "DO_NOT_SET_AT_CLIENTS";
  public $appModuleName = null;
  public $appModuleVersion = null;
  public $appModuleDescription = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'isEmpty',
          'type' => TType::BOOL,
          ),
        2 => array(
          'var' => 'appModuleId',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'appModuleName',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'appModuleVersion',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'appModuleDescription',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['isEmpty'])) {
        $this->isEmpty = $vals['isEmpty'];
      }
      if (isset($vals['appModuleId'])) {
        $this->appModuleId = $vals['appModuleId'];
      }
      if (isset($vals['appModuleName'])) {
        $this->appModuleName = $vals['appModuleName'];
      }
      if (isset($vals['appModuleVersion'])) {
        $this->appModuleVersion = $vals['appModuleVersion'];
      }
      if (isset($vals['appModuleDescription'])) {
        $this->appModuleDescription = $vals['appModuleDescription'];
      }
    }
  }

  public function getName() {
    return 'ApplicationModule';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::BOOL) {
            $xfer += $input->readBool($this->isEmpty);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->appModuleId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->appModuleName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->appModuleVersion);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->appModuleDescription);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('ApplicationModule');
    if ($this->isEmpty !== null) {
      $xfer += $output->writeFieldBegin('isEmpty', TType::BOOL, 1);
      $xfer += $output->writeBool($this->isEmpty);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->appModuleId !== null) {
      $xfer += $output->writeFieldBegin('appModuleId', TType::STRING, 2);
      $xfer += $output->writeString($this->appModuleId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->appModuleName !== null) {
      $xfer += $output->writeFieldBegin('appModuleName', TType::STRING, 3);
      $xfer += $output->writeString($this->appModuleName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->appModuleVersion !== null) {
      $xfer += $output->writeFieldBegin('appModuleVersion', TType::STRING, 4);
      $xfer += $output->writeString($this->appModuleVersion);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->appModuleDescription !== null) {
      $xfer += $output->writeFieldBegin('appModuleDescription', TType::STRING, 5);
      $xfer += $output->writeString($this->appModuleDescription);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class ApplicationDeploymentDescription {
  static $_TSPEC;

  public $isEmpty = false;
  public $appDeploymentId = "DO_NOT_SET_AT_CLIENTS";
  public $appModuleId = null;
  public $computeHostId = null;
  public $executablePath = null;
  public $appDeploymentDescription = null;
  public $moduleLoadCmds = null;
  public $libPrependPaths = null;
  public $libAppendPaths = null;
  public $setEnvironment = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'isEmpty',
          'type' => TType::BOOL,
          ),
        2 => array(
          'var' => 'appDeploymentId',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'appModuleId',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'computeHostId',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'executablePath',
          'type' => TType::STRING,
          ),
        6 => array(
          'var' => 'appDeploymentDescription',
          'type' => TType::STRING,
          ),
        7 => array(
          'var' => 'moduleLoadCmds',
          'type' => TType::LST,
          'etype' => TType::STRING,
          'elem' => array(
            'type' => TType::STRING,
            ),
          ),
        8 => array(
          'var' => 'libPrependPaths',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\AppCatalog\AppDeployment\SetEnvPaths',
            ),
          ),
        9 => array(
          'var' => 'libAppendPaths',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\AppCatalog\AppDeployment\SetEnvPaths',
            ),
          ),
        10 => array(
          'var' => 'setEnvironment',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\AppCatalog\AppDeployment\SetEnvPaths',
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['isEmpty'])) {
        $this->isEmpty = $vals['isEmpty'];
      }
      if (isset($vals['appDeploymentId'])) {
        $this->appDeploymentId = $vals['appDeploymentId'];
      }
      if (isset($vals['appModuleId'])) {
        $this->appModuleId = $vals['appModuleId'];
      }
      if (isset($vals['computeHostId'])) {
        $this->computeHostId = $vals['computeHostId'];
      }
      if (isset($vals['executablePath'])) {
        $this->executablePath = $vals['executablePath'];
      }
      if (isset($vals['appDeploymentDescription'])) {
        $this->appDeploymentDescription = $vals['appDeploymentDescription'];
      }
      if (isset($vals['moduleLoadCmds'])) {
        $this->moduleLoadCmds = $vals['moduleLoadCmds'];
      }
      if (isset($vals['libPrependPaths'])) {
        $this->libPrependPaths = $vals['libPrependPaths'];
      }
      if (isset($vals['libAppendPaths'])) {
        $this->libAppendPaths = $vals['libAppendPaths'];
      }
      if (isset($vals['setEnvironment'])) {
        $this->setEnvironment = $vals['setEnvironment'];
      }
    }
  }

  public function getName() {
    return 'ApplicationDeploymentDescription';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::BOOL) {
            $xfer += $input->readBool($this->isEmpty);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->appDeploymentId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->appModuleId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->computeHostId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->executablePath);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->appDeploymentDescription);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::LST) {
            $this->moduleLoadCmds = array();
            $_size0 = 0;
            $_etype3 = 0;
            $xfer += $input->readListBegin($_etype3, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $elem5 = null;
              $xfer += $input->readString($elem5);
              $this->moduleLoadCmds []= $elem5;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::LST) {
            $this->libPrependPaths = array();
            $_size6 = 0;
            $_etype9 = 0;
            $xfer += $input->readListBegin($_etype9, $_size6);
            for ($_i10 = 0; $_i10 < $_size6; ++$_i10)
            {
              $elem11 = null;
              $elem11 = new \Airavata\Model\AppCatalog\AppDeployment\SetEnvPaths();
              $xfer += $elem11->read($input);
              $this->libPrependPaths []= $elem11;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 9:
          if ($ftype == TType::LST) {
            $this->libAppendPaths = array();
            $_size12 = 0;
            $_etype15 = 0;
            $xfer += $input->readListBegin($_etype15, $_size12);
            for ($_i16 = 0; $_i16 < $_size12; ++$_i16)
            {
              $elem17 = null;
              $elem17 = new \Airavata\Model\AppCatalog\AppDeployment\SetEnvPaths();
              $xfer += $elem17->read($input);
              $this->libAppendPaths []= $elem17;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 10:
          if ($ftype == TType::LST) {
            $this->setEnvironment = array();
            $_size18 = 0;
            $_etype21 = 0;
            $xfer += $input->readListBegin($_etype21, $_size18);
            for ($_i22 = 0; $_i22 < $_size18; ++$_i22)
            {
              $elem23 = null;
              $elem23 = new \Airavata\Model\AppCatalog\AppDeployment\SetEnvPaths();
              $xfer += $elem23->read($input);
              $this->setEnvironment []= $elem23;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('ApplicationDeploymentDescription');
    if ($this->isEmpty !== null) {
      $xfer += $output->writeFieldBegin('isEmpty', TType::BOOL, 1);
      $xfer += $output->writeBool($this->isEmpty);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->appDeploymentId !== null) {
      $xfer += $output->writeFieldBegin('appDeploymentId', TType::STRING, 2);
      $xfer += $output->writeString($this->appDeploymentId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->appModuleId !== null) {
      $xfer += $output->writeFieldBegin('appModuleId', TType::STRING, 3);
      $xfer += $output->writeString($this->appModuleId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->computeHostId !== null) {
      $xfer += $output->writeFieldBegin('computeHostId', TType::STRING, 4);
      $xfer += $output->writeString($this->computeHostId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->executablePath !== null) {
      $xfer += $output->writeFieldBegin('executablePath', TType::STRING, 5);
      $xfer += $output->writeString($this->executablePath);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->appDeploymentDescription !== null) {
      $xfer += $output->writeFieldBegin('appDeploymentDescription', TType::STRING, 6);
      $xfer += $output->writeString($this->appDeploymentDescription);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->moduleLoadCmds !== null) {
      if (!is_array($this->moduleLoadCmds)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('moduleLoadCmds', TType::LST, 7);
      {
        $output->writeListBegin(TType::STRING, count($this->moduleLoadCmds));
        {
          foreach ($this->moduleLoadCmds as $iter24)
          {
            $xfer += $output->writeString($iter24);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->libPrependPaths !== null) {
      if (!is_array($this->libPrependPaths)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('libPrependPaths', TType::LST, 8);
      {
        $output->writeListBegin(TType::STRUCT, count($this->libPrependPaths));
        {
          foreach ($this->libPrependPaths as $iter25)
          {
            $xfer += $iter25->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->libAppendPaths !== null) {
      if (!is_array($this->libAppendPaths)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('libAppendPaths', TType::LST, 9);
      {
        $output->writeListBegin(TType::STRUCT, count($this->libAppendPaths));
        {
          foreach ($this->libAppendPaths as $iter26)
          {
            $xfer += $iter26->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->setEnvironment !== null) {
      if (!is_array($this->setEnvironment)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('setEnvironment', TType::LST, 10);
      {
        $output->writeListBegin(TType::STRUCT, count($this->setEnvironment));
        {
          foreach ($this->setEnvironment as $iter27)
          {
            $xfer += $iter27->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

$GLOBALS['applicationDeploymentModel_CONSTANTS']['DEFAULT_ID'] = "DO_NOT_SET_AT_CLIENTS";


