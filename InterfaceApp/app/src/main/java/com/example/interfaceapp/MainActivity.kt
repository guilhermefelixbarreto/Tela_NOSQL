package com.example.interfaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfaceapp.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterfaceAppTheme {
                SimpleCenterAlignedTopAppBar()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleCenterAlignedTopAppBar() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = laranjaColor
                ),
                title = {
                    Text(
                        "Cadastro",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.White
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            tint = Color.White,
                            contentDescription = "Descrição Localizada"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* fazerAlgo() */ }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            tint = Color.White,
                            contentDescription = "Descrição Localizada"
                        )
                    }
                }
            )
        },
        content = { paddingInterno ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(darkBlueColor)
                    .padding(paddingInterno)
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                SimpleUserOutlinedTextFieldSample()
                Spacer(modifier = Modifier.height(16.dp))
                SimpleCallOutlinedTextFieldSample()
                Spacer(modifier = Modifier.height(16.dp))
                ComboboxWithTextSample()
                Spacer(modifier = Modifier.height(16.dp))
                SimpleObserOutlinedTextFieldSample()
                Spacer(modifier = Modifier.height(16.dp))
                Button()
                Spacer(modifier = Modifier.height(16.dp))
                ButtonCansel()
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Row {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Ícone de Email",
                    tint = laranjaColor,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(
                    "Nome",
                    color = Color.White
                )
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done
        ),
        singleLine = true,
        modifier = Modifier.fillMaxWidth()

    )
}

@Composable
fun SimpleUserOutlinedTextFieldSample() {
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        UserOutlinedTextField(
            value = email,
            onValueChange = { email = it }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CallOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Row {
                Icon(
                    imageVector = Icons.Filled.Call,
                    contentDescription = "Ícone de Telefone",
                    tint = laranjaColor,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(
                    "Telefone",
                    color = Color.White,
                )
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done,
        ),
        singleLine = true,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun SimpleObserOutlinedTextFieldSample() {
    var observation by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        ObserOutlinedTextField(
            value = observation,
            onValueChange = { observation = it }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ObserOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Row {
                Icon(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = "Ícone de Diálogo",
                    tint = laranjaColor,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(
                    "Observação",
                    color = Color.White,
                )
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done
        ),
        singleLine = true,
        modifier = Modifier.fillMaxWidth().height(132.dp)

    )
}

@Composable
fun SimpleCallOutlinedTextFieldSample() {
    var Telephone by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        CallOutlinedTextField(
            value = Telephone,
            onValueChange = { Telephone = it }
        )
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComboboxWithTextSample() {
    val options = listOf("Selecionar","Telefone Fixo", "Celular", "WhatsApp")
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[0]) }

    val corFundoDropdown = darkBlueColor
    ExposedDropdownMenuBox(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        expanded = expanded,
        onExpandedChange = { expanded = !expanded },
    ) {
        OutlinedTextField(
            modifier = Modifier
                .menuAnchor()
                .fillMaxWidth(),
            readOnly = true,
            value = selectedOptionText,
            onValueChange = {},
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
        )

        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            options.forEach { selectionOption ->
                DropdownMenuItem(
                    text = { Text(selectionOption) },
                    onClick = {
                        selectedOptionText = selectionOption
                        expanded = false
                    },
                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                    modifier = Modifier.background(corFundoDropdown)
                )
            }
        }
    }
}


@Composable
fun Button() {
    ExtendedFloatingActionButton(
        onClick = { /* do something */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
            .height(48.dp)
            .padding(horizontal = 16.dp),
        containerColor = laranjaColor,
        contentColor = Color.Black,
        shape = MaterialTheme.shapes.small.copy(CornerSize(4.dp))
    ) {
        Text(text = "CADASTRAR", color = Color.White)
    }
}

@Composable
fun ButtonCansel() {
    ExtendedFloatingActionButton(
        onClick = { /* do something */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
            .height(48.dp)
            .padding(horizontal = 16.dp),
        containerColor = laranjaColor,
        contentColor = Color.Black,
        shape = MaterialTheme.shapes.small.copy(CornerSize(4.dp))
    ) {
        Text(text = "CANCELAR", color = Color.White)
    }
}


@Composable
@Preview
fun Login(){
    SimpleCenterAlignedTopAppBar()
}

